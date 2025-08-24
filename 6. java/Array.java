import java.util.*;
public class Array {
    public static void update(int marks[]){
           for(int i=0;i<marks.length;i++){
               marks[i] = marks[i]+1;
           }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        update(marks);
        for(int i=0;i<marks.length;i++){
            if(i>2){
                break;
            }
            else{
            System.out.println(marks[i]);
            }
        }

        System.out.println("Phy"+marks[0]);
        System.out.println("Math"+marks[1]);
        System.out.println("Eng"+marks[2]);


    }
}
