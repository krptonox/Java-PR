abstract class vehicle{
    String brand;
    int speed;
    public  vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    abstract void startEngine();
    void displayInfo(){
        System.out.println("brand: " + brand);
        System.out.println("speed : " + speed+ "km/h");

    }

}
class Car extends vehicle{
    int seats;
    public Car(String brand, int speed, int seats){
        super(brand, speed);
    }
    void startEngine(){
        System.out.println("car engine starts with push button");

    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("seats" + seats);
    }
}
class Bike extends vehicle{
    boolean hasdiscbreak;
    public Bike(String brand, int speed,boolean hasdiscbreak){
        super(brand, speed);
        this.hasdiscbreak = hasdiscbreak;
    }
    void startEngine(){
        System.out.println("bike starts with self start");
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("discbreak?" + (hasdiscbreak ? "yes":"no"));
    }
}
class Truck extends vehicle{
    int capacity;
    public Truck(String brand, int speed,int capacity){
        super(brand, speed);
        this.capacity = capacity;

    }
    void startEngine(){
        System.out.println("engine starts with key");
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("load capacity" + capacity);
    }

}
public class
Main{
    public static void main(String[] args) {
        vehicle car = new Car("toyota", 180,5);
        vehicle bike = new Bike("fr",56,true);
        vehicle truck = new Truck("VOLVO",230,5);
        System.out.println("==Car details==");
        car.startEngine();
        car.displayInfo();
        System.out.println("==bike details==");
        bike.startEngine();
        bike.displayInfo();
        System.out.println("==truck details==");
        truck.startEngine();
        truck.displayInfo();


    }
}