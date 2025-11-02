package Static_Example;

public class Human {
    int age;
    String name;
    int Salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.Salary = salary;
        this.married = married;
        Human.population +=1;
    }
}
