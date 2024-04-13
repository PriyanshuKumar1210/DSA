package Array;

public class Reversed {

    public void reverse(int arr[]) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 12, 20, 4 };
        Reversed obj = new Reversed();
        obj.reverse(arr);
    //    reverse(arr);
    }
}
