package Logical_Questions;

public class NumberPattern {
    static int i,j,count = 0;
    public static void main(String[] args) {
        pattern2();
    }

    static void pattern2(){
        System.out.println("\n\t 1st\n");
        for(i = 0;i<5;i++){
            for(j = 0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n\t 2nd\n");
        for(i = 0;i<5;i++){
            for(j = 0;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        count = 0;
        System.out.println("\n\t 3rd - 1\n");
        for(i = 0;i<4;i++){
            for(j = 0;j<=i;j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
        
        System.out.println("\n\t 3rd - 2\n");
        for(i = 1;i<=5;i++){
            count = i;
            for(j = 1;j<=i;j++){
                System.out.print(count+" ");
                count += 5-j;
            }
            System.out.println();
        }

        System.out.println("\n\t 4th\n");
        for(i = 0;i<5;i++){
            for(j = i;j>=0;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n\t 5th\n");
        for(i = 1;i<=5;i++){
            for(j = 1;j<i;j++){
                System.out.print(j);
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n\t 6th\n");
        for(i = 0;i<5;i++){
            for(j=5; j>i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        

    }
}
