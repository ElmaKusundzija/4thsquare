package org.infobip.campus.sens.model;


public class Admin implements User{

    private String username;
    private  String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private long id;

    public Admin(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String userPassword) {
        this.password=userPassword;
    }

    public void setUsername(String userUsername) {
        this.username=userUsername;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }


}
