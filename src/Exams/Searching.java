package Exams;

public class Searching {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,10,12};
        int[] arr2 = {2,3,3,5,6,6,6,6,6,6,6,6};
        int[] arr3 = {0,0,0,0,0,0};
        System.out.println("BS: " +Binary_search(arr1 , 5)); // 1 
        System.out.println("RBS: " +Recursive_BSearch(arr1, 5, 0, 7)); // 2

        System.out.println("FO: "+first_Occurrence(arr2, 6)); // 3
        System.out.println("LO: "+Last_Occurrance(arr2, 6)); // 4
        System.out.println("Count: " +Count_Occurrence(arr2, 6)); // 5
        System.out.println("count 1: " + Count_1s_in_sorted_array(arr3, 1) ); // 6
        
        
        

    }
// 1 ; itrative  
    static int Binary_search(int[] arr ,int item){
        // generaly work with sorted array ; 
        // find mid compare with item update pointers
        int start = 0, end = arr.length-1 , mid = 0;
        while(start<=end){
            mid = (start+end) /2 ;
            if(arr[mid] == item) return mid;
            if(item < arr[mid]) end = mid-1;
            else start = mid +1;
        }
        return -1;
    }
// 2 ; recursive
    // in general for 'n' size array we need O(log n) recursive call
    // SO recursive call stak holds O(log n) call 
    // auxiliary space required is O(log n);
    static int Recursive_BSearch(int[] arr, int item, int start, int end){
        if(start>end) return -1;
        int mid = (start+end)/2;
        if(item == arr[mid]) return mid;
        else if(item > arr[mid]) return Recursive_BSearch(arr, item, mid+1, end);
        else return Recursive_BSearch(arr, item, start, mid-1);

    
    }
// 3 ; 
    static int first_Occurrence(int[] arr,int item){
    // Method-1: TC = O(n) 
        // for(int i=0;i<arr.length;i++){
        //     if(item == arr[i]) return i;
        // }
    // Method-2: TC = O(log n)
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start+end) / 2;
            if(item < arr[mid]) end = mid-1;
            else if(item > arr[mid]) start = mid+1;
            else{
                if(mid == 0 || arr[mid-1] != item) return mid;
                else end = mid-1; 
            }
        }
        return -1;
    }
// 4 ;
    static int Last_Occurrance(int[] arr, int item){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start+end) / 2;
            if(item < arr[mid]) end = mid-1;
            else if(item > arr[mid]) start = mid+1;
            else{
                if(mid == arr.length - 1 || arr[mid+1] != item) return mid;
                else start = mid+1; 
            }
        }

        return 0;
    }
// 5 ;
    static int Count_Occurrence(int[] arr, int item){
        // Method-1: TC O(n);
        // int count = 0;
        // for(int i = 0; i<arr.length;i++){
        //     if(arr[i] == item) count++;
        // }
        // return count;

        // Method-1: TC O(log n);
        int first = first_Occurrence(arr, item);
        if(first == -1)
            return 0;
        else return (Last_Occurrance(arr, item) - first + 1);
    }
// 6;
    static int Count_1s_in_sorted_array(int[] arr, int item){
        int start = first_Occurrence(arr, 1);
        if(start != -1) return  arr.length - start;
        else return 0;
    }
// 7; Unbounded Binary Search
    static int search_in_infinite_Arr(int[] arr , int item){
        if(arr[0] == item) return 0;
        int i = 1;
        while(arr[i] < item)
            i = i*2;
        if(arr[i] == item) return i;
        return Binary_search_with_index(arr, item, (i/2)+1, i-1);
    }

}
