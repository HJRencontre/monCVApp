package com.example.moncvapp;

public class Formation {
    private String yearStart;
    private String yearEnd;
    private String school;
    private String place;

//    Génération du constructeur

    public Formation(String yearStart, String yearEnd, String school, String place) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.school = school;
        this.place = place;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
