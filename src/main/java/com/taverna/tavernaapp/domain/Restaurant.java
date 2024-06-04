package com.taverna.tavernaapp.domain;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;
    private String phone;
    private String email;
    private String url;

    @Column(length = 500)
    private String info;
    //private Set <Restaurant> restaurants;

    public Restaurant(String name, String address, String phone,
                            String email, String url, String info) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.info = info;
    }

    public Restaurant(Restaurant restaurant){
        this.name = restaurant.name;
        this.address = restaurant.address;
        this.phone = restaurant.phone;
        this.email = restaurant.email;
        this.url = restaurant.url;
        this.info = restaurant.info;
    }

    public Restaurant() {}

    @Override
    public String toString() {
        return "RestaurantEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

