/* Inserting element at the start of an array */
package Array;


public class InsertArray {

    public static int insert(int arr[], int n, int x, int cap ,int pos) {

        if (n == cap)
            return -1;

        int idx = pos - 1;

        for (int i = n-1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;
        return n + 1;

    }

    public static void main(String[] args) {
       int arr[] = new int[5],cap=5,n=3; 

       arr[0]=10;
       arr[1]=20;
       arr[2]=30;

        System.out.println("Elements before insertion");

       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }

        int x=7,pos=2;

        n=insert(arr,n,x,cap,pos);

        System.out.println("Elements After insertion");

       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }

    }
}