package com.example.projectuts.models;

public class AlbumLogo {
    private String logo;
    private String name;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlbumLogo(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }
}