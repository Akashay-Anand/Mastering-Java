package CollectionsInJava;

import java.util.*;

public class MyClass {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = inp.nextInt();
        int K = inp.nextInt();
        int f = 0, p = 0;

        int price[] = new int[N];
        int fuel[] = new int[N];

        for(int i = 0; i<N; i++) price[i] = inp.nextInt();
        for(int i = 0; i<N; i++) fuel[i] = inp.nextInt();

        for(int i=0; i<N; i++){
            if(p<K){
                p += price[i];
                f += fuel[i];
            }
        }



        inp.close();
    }
    
}

/*
 * N = 5
 * K = 105
 * price = 10 10 40 50 90
 * fuel  = 10 20 20 50 150
 * output = 170
 */