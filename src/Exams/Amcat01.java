package Exams;

import java.util.Arrays;

/*
// Question 1
Mr. Jason has captured your friend
and has put a collar around his neck.
He has locked it with a given 'locking
key. It can only befipened now with
an 'unlocking key'. Your friend has
seen the ‘Iocking key' but he does not
know about the 'unlocking key.

Given the locking key, one can figure
out the 'unlocking key' which is the
smallest (in magnitude) permutation
of the digits of that number and it
never starts with zero. '
Help your friend to write an

algorithm that takes the locking key
as an input and outputs the

unlocking key. 

 */

public class Amcat01 {
    public static void main(String[] args) {
        // unlokKey(725);
        // String s = "00001";
        // char res[] = findSmallestPermutation(s);
        // System.out.println(res);

        int[][] arr = {{100 ,198 ,333 ,323},{122,232,221,111},{223 ,565 ,245 ,764}};
        Arrays.sort(arr[0]);
        for(int i= 0; i<4;i++){
            System.out.println(arr[0][i]);
        }
        System.out.println(arr[0].length);

    }
    // public static void unlokKey(int key){
    //     String temp = "" +key;
    //     int n = temp.length() , i = 0;
    //     int[] arr = new int[n];
    //     for(i=0;i<n;i++){
    //         arr[i] = key%10;
    //         key = key/10;
    //     }
    //     Arrays.sort(arr);
    //     if(arr[0] == 0){
    //         i = 1;
    //         while(arr[i] == 0 && i<n){
    //             i++;
    //         }
    //         arr[0] = arr[i];
    //         arr[i] = 0;
    //     }
    //     // System.out.println( arr.toString() );
    //     n= 0;
    //     for(int j : arr){
    //         n = n*10 +j;
    //     }
    //     // System.out.println(n);
    // }
    // static char[] findSmallestPermutation(String s1)
    // {
    //     // sort the string
    //     char s[] = s1.toCharArray();
    //     Arrays.sort(s);
      
    //     int i = 0;
    //     while (s[i] == '0' )
    //         i++;
          
    //     char temp = s[0];
    //     s[0] = s[i];
    //     s[i] = temp;
    //     return s;
    // }
    
}
