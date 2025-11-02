package Inheritance;

class Animal1 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class BabyDog extends Dog1 {
    void weep() {
        System.out.println("Baby dog cries");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();
        b.eat();   // from Animal
        b.bark();  // from Dog
        b.weep();  // own method
    }
}
