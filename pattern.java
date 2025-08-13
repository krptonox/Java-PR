public class pattern {
    public static void main(String[] args) {

        System.out.println("RIGHT ANGLED TRIANGLE");
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("INVERTED RIGHT ANGLED TRIANGLE");

        for(int i=0;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("SPACCED RIGHT ANGLED TRIANGLE ");

        for(int i=0;i<=5;i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("PYRAMID");

        for(int i=0;i<=5;i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("RECTANGLE");

        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("HOLLOW RECTANGLE");

        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(j==0 || j==5 || i==0 || i==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("DIAMOND PATTERN");

        for(int i=0;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
