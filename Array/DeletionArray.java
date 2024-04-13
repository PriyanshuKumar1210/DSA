package Array;

public class DeletionArray {
    
    public static int delete(int arr[],int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x)

        if(i==n)
            return n;

        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }

        
    }
    return n-1;
}
    public static void main(String[] args) {
        int arr[] = {3,8,12,5,6};
        int x=12;
        int n=5;
        n = delete(arr,n,x);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
