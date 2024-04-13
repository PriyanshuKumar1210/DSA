package Array;

public class CheckSorted {
    public static boolean issort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]){
                    if(arr[j]>arr[i]){
                        return false;
                    }
                   
                }
                   
                if (arr[j] > arr[i]){
                    if(arr[j]<arr[i]){
                        return false;
                    }
                   
                }
                // else if(arr[j]>arr[i])
                // return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int[] arr = { 5, 4, 3, 1 };
        int arr[] = {1,2,4,3,5};
        System.out.println(issort(arr));
    }
}
