/* ------------------ Rotatte the elements of an array via anti- clock wise -------------
 * I/P : arr = {1,2,3,4,5}
 * O?P : arr = {2,3,4,5,1}
 *  
 */

package Array;

public class LeftRotate {

    public static void leftRotateOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; 
        }
            arr[n - 1] = temp;
    }

    public static void leftRotate(int arr[],int n,int d){
        for(int i=0;i<d;i++){
            leftRotateOne(arr, n);
        }
    }
    /*
     * System.out.println("After Rotating");
     * for(int i=0;i<n;i++){
     * System.out.print(arr[i]+"  ");
     * }
     * 
     * }
     */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int d = 3;
        System.out.println("Before Rotating");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        leftRotate(arr, n, d);
        System.out.println("After Rotating");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
