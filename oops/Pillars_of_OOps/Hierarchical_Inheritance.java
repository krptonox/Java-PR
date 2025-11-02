
class Animal2 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal2 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
