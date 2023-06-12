package Logical_Questions;

public class StarPattern01 {
    static int i,j;
    public static void main(String[] args) {
        pattern1();
    }
       
       
       
    static void pattern1(){
        System.out.println("\n\t1st\n");
        for(i = 0;i<5;i++){
            for(j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\t 2nd - 1 \n");
        for(i = 0;i<5;i++){
            for(j = i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\t 2nd - 2 \n");
        for(i = 0;i<5;i++){
            for(j = 4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\t 3rd \n");
        for(i = 0;i<=5;i++){
            for(j = 0;j<=5;j++){
                if(i+j>=5)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n\t 4th \n");
        for(i = 0;i<=5;i++){
            for(j = 0;j<=5;j++){
                // System.out.print("*");
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n\t 5td (simisalr to '3rd', just an extra space with ' *' )\n");
        for(i = 0;i<=5;i++){
            for(j = 0;j<=5;j++){
                if(i+j>=5) System.out.print(" *");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n\t 6td \n");
        for(i = 0;i<=5;i++){
            for(j = 0;j<=5;j++){
                if(i+j>=5) System.out.print("*");
                else System.out.print(" ");
            }
            for(j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\t 7th \n");
        for(i = 0;i<=5;i++){
            for(j = 0;j<=5;j++){
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            for(j = i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\t 8th \n");
        for(i = 0;i<5;i++){
            for(j = 0;j<=i;j++){
                if(i==j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n\t 9th \n");
        for(i = 0;i<5;i++){
            for(j = 0;j<5;j++){
                if(i+j == 4) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n\t 10th \n");
        for(i = 0;i<5;i++){
            for(j = 0; j<5;j++){
                if(i+j == 4) System.out.print("*");
                else System.out.print(" ");
            }
            for(j = 1;j<=i;j++){
                if(i==j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(); 
        }

        System.out.println("\n\t 11th \n");
        for(i =0; i<5;i++){
            for(j = 0; j<5; j++){
                if(i==j || i+j==4) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n\t 12th \n");
        for(i =1; i<=5;i++){
            for(j = 1; j<=5; j++){
                if(i>=2 && j>=2 && i<=4 && j<=4) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        

    }

    
}
