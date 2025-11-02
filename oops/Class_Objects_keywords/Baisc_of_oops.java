import javax.naming.Name;
import java.sql.SQLOutput;

public class Baisc_of_oops {
    static void main() {
        Student[] students = new Student[5];
        //declarimg
//        Student kunal;
//        kunal = new Student();

        Student kunal = new Student(13,"kunal",78.f);
        Student Rahul = new Student(17,"Ram",89.f);
        Student Random = new Student();

        System.out.println(kunal);
        System.out.println(Rahul);//giving a random value
//        kunal.rno = 7;
//        kunal.name = "Krishna Ronaldo";
//        kunal.marks = 45.5f;

        kunal.ChangeName("Rocky");
        kunal.greeting();

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);

        System.out.println(Random.name);

    }
}
//Creating class outside main function and class
//for every single student
class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("hello my name is: "+ name);
    }

    void ChangeName(String newname){
        name = newname;
    }

    //It will run when we do not pass any arguments in the
    //Constructor while defining an object
    Student(){
        this.rno = 19;
        this.name = "Random";
        this.marks = 98.2f;
    }


    //You can call constructor from another constructor
//        this(13,"default",90.f);
//}Student(){





    //It wil run when we create a object and in Constructor we will pass like
    // Student Arpit = new Student(67,"Arpit",78.5f)
    //Here thi swill replace all the stuff with given parameteres passed in
    //constructor when making an object
    Student(int rol,String Name,float mrks){
        this.rno = rol;
        this.name = Name;
        this.marks = mrks;
    }
}

