package Exams;

public class ArraysDSA {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 7, 2, 9, 4 };
        Longest_odd_even_subarray(arr);
        
    }
    public static void Longest_odd_even_subarray(int[] arr){
        // boolean flag = false;
        int ans = 0;
        int maxtill = 1;
        for(int i=1;i<arr.length;i++){
            // if((arr[i]%2==0 && arr[i-1] != 0) || (arr[i]%2 !=0 && arr[i-1]%2 == 0)) maxtill++;
            if(arr[i]%2 != arr[i-1]%2) maxtill++;
            else{
                ans = Math.max(ans,maxtill);
                maxtill = 1;
            }
        }
        System.out.println(ans);
    }
    
}


