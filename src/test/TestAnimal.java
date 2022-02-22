package test;

import domain.Fox;

public class TestAnimal {

    public static void main(String[] args) {
        Fox fox = new Fox("Jon");
        System.out.println(fox);
        fox.hunt();
        fox.eat();
        fox.speak();
        fox.play();
    }
}
