
/* ----- This program is same as a "LeftRoate.java ,but it is used only rotating two elements and that does 
            provides efficient soloution (reliablity) of code" */

package Array;

public class LeftRotate2 {

    public static void leftRotate(int arr[],int n){
        int temp1 = arr[0];
        int temp2 = arr[1];
        for(int i=2;i<n;i++){
            arr[i-2]=arr[i];

        }
            arr[n-2] = temp2;
            arr[n-1] = temp1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        // int d = 2;
        System.out.println("Before Rotating");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
            System.out.println(" ");
            
        leftRotate(arr, n);
        System.out.println("After Rotating");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
    
}
