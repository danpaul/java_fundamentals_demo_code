package nl.inholland.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dog extends Animal {
    private String breed;

    @JsonProperty("isTrained")
    private boolean isTrained;

    // getters & setters
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public boolean isTrained() { return isTrained; }
    public void setTrained(boolean trained) { isTrained = trained; }
}
