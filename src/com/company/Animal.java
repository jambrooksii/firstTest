package com.company;

public class Animal {
    String size;
    String gender;
    String species;

    public Animal( String species, String size, String gender) {
        this.size = size;
        this.gender = gender;
        this.species = species;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


}
