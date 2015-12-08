package org.infobip.campus.sens.infrastructure.configuration;


import org.infobip.campus.sens.model.data.DataLists;
import org.infobip.campus.sens.model.repository.CategoryRepositoryImpl;
import org.infobip.campus.sens.model.repository.ClientRepositoryImpl;
import org.infobip.campus.sens.model.repository.CompanyRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    @Bean
    public DataLists createDataLists() {
        return new DataLists();
    }

    @Bean
    public CategoryRepositoryImpl createCategoryRepository() {
        return new CategoryRepositoryImpl(createDataLists());
    }

    @Bean
    public ClientRepositoryImpl createClientRepository(){return new ClientRepositoryImpl(createDataLists());}

    @Bean
    public CompanyRepositoryImpl createCompanyRepository() {
        CompanyRepositoryImpl companyRepository = new CompanyRepositoryImpl();
        companyRepository.setDataLists(createDataLists());
        return companyRepository;
    }
}
