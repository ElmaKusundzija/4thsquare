package org.infobip.campus.sens.model.repository;

import org.infobip.campus.sens.model.Company;

public interface CompanyRepository {

    void createCompany(Company company);
    void updateCompany(Company company);
    void deleteCompany(int id);
}
