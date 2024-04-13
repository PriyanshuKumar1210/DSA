
import java.util.Scanner;
public class SearchArray {

    public static  void searchArray(int arr[],int x){
        int n = arr.length;
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(x==arr[i])
                flag = true;
        }
            if(flag==true){
                System.out.println("Elements are in array");
            }
            else
                System.out.println("Not in array");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements to search in an array");
        int x = sc.nextInt();
        searchArray(arr,x);
        
        sc.close();
    }
    
}
