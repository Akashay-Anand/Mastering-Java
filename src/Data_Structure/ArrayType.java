package Data_Structure;

public class ArrayType {
    public static void main(String[] args) {
        // simple array structure
        int[] arr1 = {34,56,3,8,10}; // #1
        int[] arr2 = new int[3];     // #2 defining array of size 3.
        arr1[0] = 6;    // storing 6 at index 0

        System.out.println("length of arr1: "+arr1.length+"\nlength of arr2: "+arr2.length); // [note-2]
        System.out.println("printing value with the help of index: "+arr1[3]);

        // multi dimensional array
        int[][] marr1 = {   {341,425,563,2,0}, {1,2,3,4,5,6,7,8}, {11,22,33}  };    // #1

        int[][] marr2 = new int[3][];   // #2 
        marr2[0] = new int[10]; //this create an empty array of size 10 and adds to marr2 at index 0
        marr2[1] = new int[2]; //this create an empty array of size 2 and adds to marr2 at index 1
        marr2[2] = new int[5]; //this create an empty array of size 5 and adds to marr2 at index 2
        
        marr2[1][0] = 98;   // storing value in it
        //we can also assign them value with the help of loop 

        // printing the value of multidimensional array.
        for(int[] ar : marr1){      // for-each loop... Iterating through array
            for(int value : ar ){
                System.out.print(value);
            }
            System.out.println();
        }

        for(int i = 0; i < marr1.length; i++){      // for loop... Iterating through array
            for(int j = 0; j < marr1[i].length; j++){
                System.out.println(marr1[i][j]+" ");
            }
            System.out.println();
        }
                    


    }
}

// [note-1]: array index start from 0.
// [note-2]: length keyword is use to check the length of array.
