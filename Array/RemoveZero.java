/* ------------- Remove the zero element and fixed it into the last index ------------- */

package Array;

public class RemoveZero {

    public static void removeZero(int arr[]) {
        int n = arr.length;
        // int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        swap(arr[i],arr[j]);
                
                    }
                }
                
            }
        }

        
    }

    public static void swap(int arr,int arr2){
            // int n = arr.length;
            //  for(int i=0;i<n;i++){
                int temp = arr;
                arr = arr2;
                arr2 = temp;
            //  }
    }
    public static void main(String[] args) {
        int arr[] = { 8, 5, 0, 10, 0, 20 };
        removeZero(arr); /*
        * int temp = arr[i];
        * arr[i] = arr[i+1];
        * arr[i+1] = temp;
        */
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
