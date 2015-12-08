import org.infobip.campus.sens.model.repository.CategoryRepository;

import org.infobip.campus.sens.model.Client;
import org.infobip.campus.sens.model.Category;
import org.infobip.campus.sens.model.data.DataLists;
import org.infobip.campus.sens.model.repository.ClientRepository;
import org.infobip.campus.sens.model.repository.ClientRepositoryImpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppTest {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        DataLists dataList= applicationContext.getBean(DataLists.class);

        CategoryRepository categoryRepository=applicationContext.getBean(CategoryRepository.class);
        Category category=new Category("Ples");
        categoryRepository.addCategory(category);
        System.out.println(dataList.writeCategory());


        ClientRepository clientRepository=new ClientRepositoryImpl(dataList);
        clientRepository.createClient(new Client(12,"Elma","elma"));
        System.out.printf(clientRepository.getClientByID(0).toString());


    }

}
