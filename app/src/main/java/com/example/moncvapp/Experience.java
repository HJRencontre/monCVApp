package com.example.moncvapp;

public class Experience {
    private String yearStart;
    private String yearEnd;
    private String company;
    private String description;

//Génération du constructeur
    public Experience(String yearStart, String yearEnd, String company, String description) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.company = company;
        this.description = description;
    }

//    Génération des getters and setters

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
