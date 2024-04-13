package Array;
import java.util.Scanner;


public class InsertArray2 {

    public static int insert(int arr[],int n,int x,int cap,int pos){

        if(n==cap){
            return -1;
        }

        int idx =pos-1;

        for(int i=n-1;i>=idx;i--){
            arr[i+1]=arr[i];
        }

            arr[idx]=x;
            return n+1;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array");
        int n = sc.nextInt();
        
        System.out.println("Enter the capacity of an array");
        int cap = sc.nextInt();

        System.out.println("Enter the position of an array");
        int pos = sc.nextInt();


        int arr[] = new int[n];

        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){

                arr[i]=sc.nextInt();
        }
       
            

        System.out.println("Enter the number which you want to insert into the array list");
        int x=sc.nextInt();

        sc.close();
        System.out.println("Elements Before Insertion");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }

        n = insert(arr,n,x,cap,pos);
      
        System.out.println("Elements After Insertion");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}