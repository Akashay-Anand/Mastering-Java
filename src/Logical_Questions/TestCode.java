package Logical_Questions;

public class TestCode {
    public static void main(String[] args) {
        int i,j,k=7,count=0,ans = 0;
        char arr[] = {'w','e','a','l','l','l','o','v','e','y','o','u'};

        for(i = 0; i<arr.length - k;i++){
            count = 0;
            for(j = i;j<= i+k; j++){
                if(ans == k) break;
                else if(arr[j]=='a'||arr[j] == 'e' || arr[j]=='i'||arr[j] == 'o' || arr[j] == 'u'){
                    count++;
                }
            }
            System.out.println(arr[i]);
            if(count > ans) ans = count;
        }
        System.out.println(ans);
    }
}
