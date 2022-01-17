package com.dit;

public class HomeFour {
    public static void main(String... args) {
    Dog name = new Dog();

    name.name = "Belka";

    name.age = 2;

    name.weight = 2;

    Feed carrot = new Feed("vegetable");

    Feed steak = new Feed("meat");

        name.say();

        name.eat(carrot);

        System.out.println("Weight is: " + name.getWeight());

        name.eat(steak);

        System.out.println("Weight is: " + name.getWeight());

        System.out.println("This cat is " + name.name +
            " of age " + name.age + " has weight " + name.weight);
}
}
