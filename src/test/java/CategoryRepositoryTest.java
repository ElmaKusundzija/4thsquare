import org.infobip.campus.sens.model.Category;
import org.infobip.campus.sens.model.Client;
import org.infobip.campus.sens.model.Company;
import org.infobip.campus.sens.model.data.DataLists;
import org.infobip.campus.sens.model.repository.*;
import org.junit.Test;




import org.infobip.campus.sens.model.repository.ClientRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;

import java.util.ArrayList;

public class CategoryRepositoryTest {


    @Mock
    private DataLists dataLists;
    private CategoryRepository categoryRepository;
    private ClientRepository clientRepository;
    private CompanyRepository companyRepository;


    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        categoryRepository=new CategoryRepositoryImpl(dataLists);
        clientRepository=new ClientRepositoryImpl(dataLists);
        companyRepository=new CompanyRepositoryImpl(dataLists);
    }

    @Test
    public void addCategory(){
        Mockito.when(dataLists.getCategories()).thenReturn(new ArrayList<Category>(0));

        Category category=new Category("Ples");
        categoryRepository.addCategory(category);
        int number=dataLists.getCategories().size();
        boolean tramvaj=false;
        if(number==1)
            tramvaj=true;
        org.junit.Assert.assertTrue(tramvaj);
    }



}
