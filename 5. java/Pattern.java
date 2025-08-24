public class Pattern {
    public static void main(String[] args){
        int n = 5;
        System.out.println("Ques 1");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Ques 2");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Ques 3");

        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Ques 4");
        for(int i=0;i<n;i++){
            for(int j=n;j<i;j--){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Ques 5");

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=n;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Ques 6 part 1");

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("    ");
            }
            for(int k=n;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Ques 6 part 2");

        for(int i=0;i<n;i++){
            for(int j=n;j>i+1;j--){
                System.out.print("    ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Ques 7");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i == 0 || i == n - 1  || j==0 || j==n-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Ques 8");

        int a = n-1;
        int b = 0;
        int c = b;
        int d = a;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("* ");
                }
                else if(i==b && j==a){
                    System.out.print("* ");

                    a--;
                    b++;

                }
                else if(i==d && j==c){
                    System.out.print("* ");
                    d--;
                    c++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

            System.out.println();
        }


    }
}
