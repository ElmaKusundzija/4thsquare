package org.infobip.campus.sens.model;


import java.util.List;

public class Client implements User {


    private long id;
    private String username;
    private  String password;
    private  String name;
    private  String surname;
    private String email;
    private  String telephone;
    private List<User> companies;
    // TODO make list of categories


    public Client() {

    }

    public Client(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return telephone;
    }

    public void setTel(String tel) {
        this.telephone = tel;
    }

    public List<User> getCompanies() {
        return companies;
    }

    public void setCompanies(List<User> companies) {
        this.companies = companies;
    }


    public void setPassword(String userPassword) {
        this.password = userPassword;
    }

    public void setUsername(String userUsername) {
        this.username = userUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return id == client.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}