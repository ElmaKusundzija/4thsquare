package org.infobip.campus.sens.model.repository;

import org.infobip.campus.sens.model.Client;
import org.infobip.campus.sens.model.data.DataLists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ClientRepositoryImpl implements ClientRepository{

    private DataLists dataLists;
    //private List<Client> clients;
    final static Logger LOGGER = LoggerFactory.getLogger(ClientRepositoryImpl.class);

    public ClientRepositoryImpl(DataLists dataLists) {
        this.dataLists = dataLists;
        //this.clients = dataLists.getClients();
    }

    public void createClient(Client c) {
        List<Client> clients=dataLists.getClients();
        clients.add(c);
        dataLists.setClients(clients);
    }

    public void updateClient(Client c) {
        List<Client> clients=dataLists.getClients();
        for (Client client : clients) {
            if(client.equals(c)){
                deleteClient(client);
                createClient(c);
            }
        }
        dataLists.setClients(clients);
    }

    public void deleteClient(Client c) {
        List<Client> clients=dataLists.getClients();
        if(clients.remove(c)) {
            dataLists.setClients(clients);
        }
        LOGGER.error("Client not found.");
    }

    public int getNumOfClients(){
        return this.dataLists.getClients().size();
    }

    public List<Client> getAllClients() {
        return this.dataLists.getClients(); 
    }

    public Client getClientByID(int id) {

        List<Client> clients=dataLists.getClients();
        for (Client client : clients) {
            if (id == client.getId()) {
                return client;
            }
        }
        LOGGER.error("Client ID not found.");
        return null;
    }
}
