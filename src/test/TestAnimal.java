package test;

import domain.Fox;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Fox fox = new Fox("Jon");
        System.out.println(fox);
        fox.hunt();
        fox.eat();
        fox.speak();
        fox.play();
    }
}
