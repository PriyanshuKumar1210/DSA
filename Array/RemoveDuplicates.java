package Array;

public class RemoveDuplicates {

    public static int removeDuplicate(int arr[],int n){
     //   int n = arr.length;
      //  int temp[];
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res =1;

        for(int i=0;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }

            for(int i=0;i<n;i++){
                arr[i]=temp[i];
            }
            return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,10,10,20,30,40};
        int n = arr.length;
        System.out.println(removeDuplicate(arr,n));
    }
}
