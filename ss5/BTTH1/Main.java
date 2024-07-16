package ss5.BTTH1;

import ss5.BTTH1.ra.Animal;
import ss5.BTTH1.ra.Cat;
import ss5.BTTH1.ra.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Pig");
        Dog dog1 = new Dog("Becgie", "black");
        Dog dog2 = new Dog("Pug", "white");
        Cat cat = new Cat("Dora");
        System.out.println("animal1's name is " + animal1.getName());
        animal1.setName("Bird");
        System.out.println("animal1's name is " + animal1.getName());
        dog1.setName("Corgi");
        System.out.println("Name " + dog1.getName());
        System.out.println("Sound " + dog1.makeSound());
        System.out.println("Color " + dog2.getColor());
        System.out.println("Sound " + dog2.makeSound());
        System.out.println("Name " + cat.getName());
        System.out.println("Sound " + cat.makeSound());
    }
}