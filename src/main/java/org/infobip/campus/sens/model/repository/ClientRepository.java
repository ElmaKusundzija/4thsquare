package org.infobip.campus.sens.model.repository;

import org.infobip.campus.sens.model.Client;

import java.util.List;

public interface ClientRepository {
    void createClient(Client c);
    void updateClient(Client c);
    void deleteClient(Client c);
    int getNumOfClients();
    List<Client> getAllClients();
    Client getClientByID(int id);
}
