package org.infobip.campus.sens.model.repository;

import org.infobip.campus.sens.model.Company;
import org.infobip.campus.sens.model.data.DataLists;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompanyRepositoryImpl implements CompanyRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyRepositoryImpl.class);

    private DataLists dataLists;

    public CompanyRepositoryImpl(DataLists dataLists) {
        this.dataLists = dataLists;
    }

    public CompanyRepositoryImpl() {

    }

    public void setDataLists(DataLists dataLists) {
        this.dataLists = dataLists;
    }

    public void createCompany(Company company) {
        dataLists.getCompanies().add(company);

        LOGGER.info("Added company", company);

    }

    public void updateCompany(Company company) {
        List<Company> companies = dataLists.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getId() == company.getId()) {
                companies.remove(companies.get(i));
            }
        }
        companies.add(company);

        LOGGER.info("Updated company: ", company);
    }


    public int getNumOfCompanies() {
        return this.dataLists.getCompanies().size();
    }

    public void deleteCompany(int id) {
        boolean isDeleted = dataLists.getCompanies().remove(findCompanyById(id));

        if (isDeleted == false) {
            LOGGER.error("Company is not deleted: ", dataLists.getCompanies().get(id));
        }

        LOGGER.info("Company deleted: ", dataLists.getCompanies().get(id));

    }

    public List<Company> getAllCompanies() {
        return this.dataLists.getCompanies();
    }

    public Company findCompanyById(int id) {
        Company company = null;
        for (int i = 0; i < dataLists.getCompanies().size(); i++) {
            if (dataLists.getCompanies().get(i).getId() == id) {
                company = dataLists.getCompanies().get(i);
            }
        }
        return company;
    }

    public void deleteCompany(Company company) {
        dataLists.getCompanies().remove(company);
        LOGGER.info("Deleted company: ", company);

    }
}
