package com.geektech.hw73.fragments.fragment1.model;

public class Fragment1Model {
    private int photo;
    private String dead;
    private String nameAndSurname;

    public Fragment1Model(int photo, String dead, String nameAndSurname) {
        this.photo = photo;
        this.dead = dead;
        this.nameAndSurname = nameAndSurname;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDeadOrAlive() {
        return dead;
    }

    public void setDeadOrAlive(String deadOrAlive) {
        this.dead = deadOrAlive;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }
}
