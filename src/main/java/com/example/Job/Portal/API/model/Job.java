package com.example.Job.Portal.API.model;

public class Job {

    private int id;
    private String title;
    private String company;
    private String location;
    private String experience;

    public Job() {
    }

    public Job(int id, String title, String company,
               String location, String experience) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
