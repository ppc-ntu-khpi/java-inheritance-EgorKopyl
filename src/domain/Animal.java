package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    String name;

    int weight;

    int age;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name="generic animal";
        weight=8;
        age=3;
    }


/** 
 *
 * Eat
 *
 */
    public void Eat() { 

        System.out.println("Animal eating...");
    }


/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Animal speaking...");
    }
@Override

/** 
 *
 * To string
 *
 *
 */
    public String toString() { 

        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg"+"\nAge:\t"+age+" years";
    }
}
