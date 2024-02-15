package com.luv2code.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;

    private String country;

    private String favoriteLangauge;

    private List<String> favoriteSystems;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLangauge() {
        return favoriteLangauge;
    }

    public void setFavoriteLangauge(String favoriteLangauge) {
        this.favoriteLangauge = favoriteLangauge;
    }

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }
}
