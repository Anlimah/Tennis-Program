package com.tennis.tournament;

public class Person {

    private String birthName;
    private String currentName;
    private String firstName;
    private String nickName;
    private String birthDate;
    private String birthPlace;
    private String deathDate;
    private String nationality;
    private String gender;
    private double height;
    private double weight;

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        if (this.birthName.length() == 0)
            this.birthName = birthName;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        if (this.deathDate == "")
            this.birthPlace = birthPlace;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        if (this.deathDate == "")
            this.deathDate = deathDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (this.gender == "")
            this.gender = gender;
    }

    Person () {}
}
