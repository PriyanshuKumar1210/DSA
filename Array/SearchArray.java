package Array;

public class SearchArray {
   public static int search(int arr[], int n, int x) {
 
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
               return i;
        }
       return -1;    
           
    }
    public static void main(String[] args) {
        int arr[] = {20,5,7,25};
        int x=15;
        int res = search(arr,arr.length,x);
   
        System.out.println(res);
    }
}