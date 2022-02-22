package domain;

public class Animal {

    String name;

    int weight;

    int age;

    public Animal() {
        name="generic animal";
        weight=8;
        age=3;
    }

    public void Eat() {
        System.out.println("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }
@Override
    public String toString() {
        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg"+"\nAge:\t"+age+" years";
    }
}
