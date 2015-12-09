import org.infobip.campus.sens.model.Category;
import org.infobip.campus.sens.model.Client;
import org.infobip.campus.sens.model.data.DataLists;
import org.infobip.campus.sens.model.repository.ClientRepository;
import org.infobip.campus.sens.model.repository.ClientRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryTest {

    @Mock
    private DataLists dataLists;
    @Mock
    private Client client;
    private ClientRepository clientRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addClientTest(){
        Mockito.when(dataLists.getClients()).thenReturn(new ArrayList<Client>());
        clientRepository=new ClientRepositoryImpl(dataLists);
        clientRepository.createClient(client);
        clientRepository.createClient(client);
        Assert.assertEquals(2,clientRepository.getNumOfClients());

    }

    @Test
    public void updateClientTest(){
        Mockito.when(dataLists.getClients()).thenReturn(new ArrayList<Client>());
        clientRepository=new ClientRepositoryImpl(dataLists);
        Client clientP=new Client();
        clientRepository.createClient(clientP);
        clientP.setName("Elma");
        clientRepository.updateClient(clientP);
        Assert.assertEquals("Elma",clientRepository.getClientByID(0).getName());

    }

    @Test
    public void deleteClientTest(){
        Mockito.when(dataLists.getClients()).thenReturn(new ArrayList<Client>());
        clientRepository=new ClientRepositoryImpl(dataLists);
        Client clientP=new Client();
        clientRepository.createClient(clientP);
        Assert.assertEquals(1,clientRepository.getNumOfClients());
        clientRepository.deleteClient(clientP);
        Assert.assertEquals(0,clientRepository.getNumOfClients());

    }


}
