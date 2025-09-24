package nl.inholland.models;

public class Cat extends Animal {
    private String color;
    private int livesLeft;

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getLivesLeft() { return livesLeft; }
    public void setLivesLeft(int livesLeft) { this.livesLeft = livesLeft; }
}
