package Exams;

/*

 Q) There were a large number of orders placed on Amazon Prime Day. The orders are packed and are at the warehouse ready to be delivered. The delivery agent needs to deliver them in as few trips as possible. In a single trip, the delivery agent can choose packages following either of two rules:
 * Choose two packages with the same weight
 * Choose three packages with the same weight
Determine the minimum number of trips required to deliver the packages. If it is not possible to deliver all of them, return -1.

Example cases -
Input: boxes - [2, 2, 3, 3, 2, 4, 4, 4, 4, 4]
Output: 4
Explanation: 3 boxes of weight 2 in 1st round, 2 boxes of weight 3 in 2nd round, 3 boxes of wt 4 in 3rd and 2 boxes of wt 4 in 4th round.

Input: boxes - [2, 3, 3]
Output: -1
Explanation: There is only one box with weight 2 and we can only take either 2 or 3 boxes in one round not lesser.

 */

import java.util.*;
public class Amz_Weight {
    public static void main(String[] args) {

        int[] arr = {2,2,3,3,2,4,4,4,4,4};
        // System.out.println("Brute Force = " + BruteForce_Method(arr) );  
        System.out.println("Modified Brute Force = " + Modified_BruteForce_Method(arr));
        // for (int i : arr) { System.out.println(i); }
    }

    public static int BruteForce_Method(int[] nums){
        int arr_size = nums.length;
        int[] frequency = new int[arr_size] ;
        int flag = -1 , count = 0;

        for(int i = 0; i < arr_size; i++){
            count = 1;
            for(int j = i+1; j<arr_size; j++){
                if(nums[i] == nums[j]) {
                    count++;
                    frequency[j] = flag;
                }
            }
            if(frequency[i] != flag) frequency[i] = count;
        }
        count = 0;
        for (int i : frequency) {
            if(i != -1){
                // if(i == 1 || (i%2 == 1 && i%3 == 1) ){
                //     return -1;
                // }
                if(i == 1) return -1;
                else count += i/3 + ((i%3 != 0)?1:0) ;
            }
        }
        return count;
    }

    public static int Modified_BruteForce_Method(int[] nums){
        
        int freq = 1, count = 0;
        Arrays.sort(nums);  // sort array
        for(int i = 1 ; i< nums.length; i++){ // itrate array
            if(nums[i] == nums[i-1]) freq++; // calculate frequency
            else{
                if(freq == 1) return -1;    
                else count += freq/3 + ((freq%3 != 0)?1:0); // calculate round for individual frequency
                freq = 1;
            }
        }
        if(freq == 1) return -1;
        else count += freq/3 + ((freq%3 != 0)?1:0);

        return count;
    }
}
