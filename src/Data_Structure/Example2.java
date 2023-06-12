package Data_Structure;

public class Example2 {
    int[] arr = {2,4,6,3,5,1}; 

    // shorting code
    public void bubbleSort(){
        int[] array = {2,4,6,3,5,1};
		int len = array.length;
		int temp=0;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(array[j]>array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i=0;i<len;i++){
			System.out.println(array[i]);
		}
	}

    public void insertionSort (){
        int[] arr = {2,4,6,3,5,1};
		int len = arr.length;
		int temp =0;
		for(int i=1;i<len;i++){
			temp = arr[i];
			int j=i-1;
			while( j >= 0 && arr[j] > temp){
				arr[j+1] =arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
		for(int i : arr) System.out.println(i);
	}

    public void selectionSortLargestEle(){
		int x,len = arr.length;
		int temp =arr[0];
		for(int i=0;i<len;i++){
			x = 0;
			for(int j=0;j<len-i;j++)
				if(arr[j] > arr[x])
					x = j;
				
			temp = arr[len-1-i];
			arr[len-1-i] = arr[x];
			arr[x] = temp;	
		}
		for(int i : arr)System.out.println(i);
	}

    public void selectionSortSmallestEle(){
		int x,n = arr.length;
		for(int i=0;i<n-1;i++){
			x=i;
			for(int j = i+1;j<n;j++)
				if(arr[j]<arr[x]) x=j;
			
			int temp = arr[x];
			arr[x] = arr[i];
			arr[i] = temp;
		}
		for(int i : arr) System.out.println(i);
	}
    
    // example code
    public void countDublicate(){
        int arr[] = {3,2,3,3,3,1};
        int count = 0,element = 3;         
        for(int i =0; i< arr.length; i++){
            if(arr[i] == element) count++;
        }
        System.out.println(element + " repeated : " + count + " times");
    }
    
    public void TransposeMatrix(){
        int[][] matrix = { {1,2},{3,4},{5,6} };

        System.out.println("Origianal Matrix: ");
        for(int[] ar : matrix){
            for(int b : ar ){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        
        // transpose code
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                arr[j][i] = matrix[i][j];
            }
        }

        System.out.println("New matrix : ");
        for(int[] ar : arr){
            for(int b : ar){
                System.out.print(b+" ");
            }
            System.out.println();
        }

    }




}
