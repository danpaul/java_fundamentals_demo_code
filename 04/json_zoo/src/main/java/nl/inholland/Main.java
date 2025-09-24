package nl.inholland;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.inholland.models.Animal;
import nl.inholland.models.Cat;
import nl.inholland.models.Dog;
import nl.inholland.models.Zoo;

import java.io.Console;
import java.io.File;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = Main.class.getResourceAsStream("/animals.json");
            Zoo zoo = mapper.readValue(inputStream, Zoo.class);

            for (Animal animal : zoo.getAnimals()) {
                System.out.println("Animal type: " + animal.getClass().getSimpleName());
                System.out.println("Name: " + animal.getName());
                System.out.println("Age: " + animal.getAge());

                if (animal instanceof Dog) {
                    Dog dog = (Dog) animal;
                    System.out.println("Breed: " + dog.getBreed());
                    System.out.println("Trained: " + dog.isTrained());
                } else if (animal instanceof Cat) {
                    Cat cat = (Cat) animal;
                    System.out.println("Color: " + cat.getColor());
                    System.out.println("Lives left: " + cat.getLivesLeft());
                }
                System.out.println("----");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}