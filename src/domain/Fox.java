package domain;


 /**
 * The class Fox extends predator
 */ 
public class Fox extends Predator {

    private String kind;


/** 
 *
 * Fox
 *
 * @param name  the name
 * @param weight  the weight
 * @param age  the age
 * @param kind  the kind
 */
    public Fox(String name ,int weight, int age, String kind) { 

        this.name=name;
        this.weight=weight;
        this.age=age;
        this.kind=kind;
    }


/** 
 *
 * Fox
 *
 */
    public Fox() { 

        this("Mery",8,3,"just a fox");
    }

/** 
 *
 * Fox
 *
 * @param name  the name
 */
    public Fox(String name) { 

        this(name,8,3,"just a fox");
    }

/** 
 *
 * Fox
 *
 */
    public void Fox() { 

    }


/** 
 *
 * Play
 *
 */
    public void play() { 

        System.out.println("The fox plays with fox cubs");
    }
    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Fox hunting for a mouse, rebbit and chicken");
    }
    @Override

/** 
 *
 * To string
 *
 * 
 */
    public String toString() { 

        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Fox!";
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Yap-yap-yap!Yap-yap-yap!");
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Fox eats meat and berries, and other");
    }
}
