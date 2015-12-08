package org.infobip.campus.sens.model.data;

import org.infobip.campus.sens.model.Category;
import org.infobip.campus.sens.model.Client;
import org.infobip.campus.sens.model.Company;
import org.infobip.campus.sens.model.Event;

import java.util.ArrayList;
import java.util.List;


public class DataLists {

    List<Category> categories;
    List<Client> clients;
    List<Event> events;
    List<Company> companies;

    public DataLists() {

        categories=new ArrayList<Category>();
        clients=new ArrayList<Client>();
        events=new ArrayList<Event>();
        companies=new ArrayList<Company>();

    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }


    public String writeCategory() {
        return "DataLists {" +
                "categories=" + categories.get(0).getName() +
                '}';
    }
}
