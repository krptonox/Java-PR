public class String_concat {
    static void main(String args[]) {
        String s1 = "Sun"; //Inside Intern pool
        String s2 = "Jinwoo"; //Inside Intern pool
        String s3 = s1 + s2; //Outside Intern pool
        String s4 = s1 + " " + s2; //Outside Intern pool
        String s5 = s1.concat(s2); //outside Intern pool
        String s6 = "sun "+ s2; //Outside Intern Pool
        String s7 = "solo "+"leveling"; //Inside Inern Pool
        System.out.println(s7);
        System.out.println(s6);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println("Hello"+10+20+"Bye"+2+7);
        System.out.println(2+3+"solo"+78+82);
    }
}
