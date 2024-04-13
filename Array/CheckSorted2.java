//WAP to check array is sorted or not in efficient way
package Array;

public class CheckSorted2 {

    public static boolean issort(int arr[]){

        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
            return true;
    }
    public static void main(String[] args) {
        int arr[] = {4,7,8,13,46};
        System.out.println(issort(arr));
    }
    
}
