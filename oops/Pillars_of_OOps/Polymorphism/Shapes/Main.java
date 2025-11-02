package Polymorphism.Shapes;

public class Main {
    static void main() {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
