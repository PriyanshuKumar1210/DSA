package Array;

public class Swap {

    public static void swap(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i=i+2) {
            
             int temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
             

           
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 0, 10, 0, 20 };
        swap(arr);
    }

}
