package CollectionsInJava;
import java.util.*;
public class AmazonTest {
    public static void main(String[] args) {
        // Scanner inp = new Scanner(System.in);
        int arr[] = {010};
        int n =3;
        System.out.println(maxones(arr,n,9));





    }

    static int maxones(int arr[], int n, int m)
    {

    int left[] = new int[n];

    int right[] = new int[n];
    Vector<Integer> zero_pos = new Vector<>();
    int count = 0;
    int previous_index_of_zero = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i]!=0) {
            count++;
        }
        else {
            left[i] = count;
            zero_pos.add(i);
            if (previous_index_of_zero != i
                && previous_index_of_zero != -1) {
                right[previous_index_of_zero] = count;
            }
            count = 0;
            previous_index_of_zero = i;
        }
    }
    right[previous_index_of_zero] = count;
 
    int max_one = -1;
    Vector<Integer> result_index = new Vector<>();
    int i = 0;
 
    while (i <= (zero_pos.size()) - m) {
        int temp = 0;
        Vector<Integer> index = new Vector<>();
 
        for (int c = 0; c < m; c++) {
            temp += left[zero_pos.elementAt(i + c)]
                    + right[zero_pos.elementAt(i + c)] + 1;
            index.add(zero_pos.elementAt(i + c));
        }
        temp = temp - (m - 1);

        if (temp > max_one) {
            max_one = temp;
            result_index = index;
        }
        i += 1;
    }
 
    return result_index.size();
    
}


}
    // public int Find(int arr[] , int n){


    //     return 0;
    // }


    // public int MissingMarbles(int number, int[] bowls)

    //     {
 
    //         int sum = bowls[0] + bowls[number - 1];
    //         int missing = 0;
    //         int i = 1, j = number - 2;
    //         while(i<=j)            {
    //             if(bowls[i]+bowls[j] == sum)
    //             {  
    //                 i++;  
    //                 j = j - 1;  
    //             }
    //             else  
    //             {
    //                 if (i == j)  missing = sum - bowls[i];
    //                 else missing = (sum - (bowls[i] + bowls[j]));
    //                 break;
    //             }
    //         }
    //         return missing;
    //     }










// int n = 6;
// for(int i=0;i<=n;i++){
//     for(int j = i; j>=0 ; j--){
//         System.out.print((char)(65 +(n-j)));
//     }
//     System.out.println();
// }

