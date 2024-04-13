package Array;

public class Reverse {

    public static void reverse(int arr[]){
        int n = arr.length;
        System.out.println("Original Array ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
            System.out.println("");
        System.out.println("Reversed Array");
        for(int i = n-1;i>=0;i--){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,7,30,8};
        reverse(arr);
    }
}
