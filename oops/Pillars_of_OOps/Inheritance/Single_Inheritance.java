package Inheritance;

class Animal {
    void eat() {
        System.out.println("Inheritance.Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Inheritance.Dog barks");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Inheritance.Animal
        d.bark();  // own method
    }
}
