package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {

    @JsonProperty
    private String city;

    // Default constructor needed for Jackson
    public Search() { }

    public Search(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
