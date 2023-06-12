package Exams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Temp_Test {
   
    public static void main(String[] args) {

    System.out.println(MaxSubarraySum(null, 0));        

    }

    /*
    
    Calculate closer distance 3.5 marks 
Problem Statement 
You are given a function, 
int Distance(int Ax, int Ay, int Bx, int By); 
 
The function accepts the coordinates of truck A(Ax, Ay) and the coordinates of truck B(Bx, By), as input. The office is at location (0, 0). Implement the function to determine which truck is closer to the office by comparing the square of their distances. Return the square of the distance of the truck which is closer to the office. 
Square of distance between two points having coordinates (x, y) and (0, 0): 
(Distance)2 = [x2 + y2]
     
    
     */
    public static int Distance(int Ax, int Ay, int Bx, int By){
        int DA = Ax*Ax + Ay*Ay;
        int DB = Bx*Bx + By*By; 
        return (DA>DB)?DB:DA;
    }

    public static int MaxSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0, res = -1, sum = 0;
        
        for(int right = 0; right<nums.length; right++)
        {
            while(left < right && (set.contains(nums[right]) || set.size() >= k))
            {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            sum +=nums[right];
            set.add(nums[right]);
            if (set.size() == k)
                res = Math.max(res, sum);
        }
            return res;
        }
    
}

