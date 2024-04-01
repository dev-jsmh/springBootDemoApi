package com.example.demo.model;

/**
 *
 * @author samuel
 *
 * This class represent a client entity on the data base an has all the required
 * data for contact a client
 */
public class Client {

    private Long client_id;
    private String dni;
    private String phone;
    private String first_name;
    private String secund_name;
    private String first_lastname;
    private String secund_lastname;
    private String address;
    private String neighborhood_id; // and relation with the neighborhood table 
    private String image; // it is the URL of the client photo profile
    private String last_meet;

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecund_name() {
        return secund_name;
    }

    public void setSecund_name(String secund_name) {
        this.secund_name = secund_name;
    }

    public String getFirst_lastname() {
        return first_lastname;
    }

    public void setFirst_lastname(String first_lastname) {
        this.first_lastname = first_lastname;
    }

    public String getSecund_lastname() {
        return secund_lastname;
    }

    public void setSecund_lastname(String secund_lastname) {
        this.secund_lastname = secund_lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood_id() {
        return neighborhood_id;
    }

    public void setNeighborhood_id(String neighborhood_id) {
        this.neighborhood_id = neighborhood_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLast_meet() {
        return last_meet;
    }

    public void setLast_meet(String last_meet) {
        this.last_meet = last_meet;
    }

}
