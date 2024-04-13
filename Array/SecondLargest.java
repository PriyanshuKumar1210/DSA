// WAP to find the second largest element of an array
package Array;

public class SecondLargest {

    public static int secondLargest(int arr[]) {
        int largest = getLargest(arr);
        int res = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[largest]) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static int getLargest(int arr[]) {
        int n = arr.length;
/*
            int largest =0;
            for(int i=0;i<n;i++)
            if(arr[i]>arr[largest])
                largest=i;
        return largest;
    }
        */
        for (int i = 0; i < n; i++) {
            boolean flag = true;

            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 12, 2 };
        System.out.println(secondLargest(arr));
    }
}
