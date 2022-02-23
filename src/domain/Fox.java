package domain;

public class Fox extends Predator {

    private String kind;

    public Fox(String name ,int weight, int age, String kind) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.kind=kind;
    }

    public Fox() {
        this("Mery",8,3,"just a fox");
    }
    public Fox(String name) {
        this(name,8,3,"just a fox");
    }
    public void Fox() {
    }

    public void play() {
        System.out.println("The fox plays with fox cubs");
    }
    @Override
    public void hunt() {
        System.out.println("Fox hunting for a mouse, rebbit and chicken");
    }
    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Fox!";
    }

    @Override
    public void speak() {
        System.out.println("Yap-yap-yap!Yap-yap-yap!");
    }

    public void eat() {
        System.out.println("Fox eats meat and berries, and other");
    }
}
