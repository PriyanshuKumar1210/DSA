import java.util.Scanner;

public class CheckSorted {

    public static boolean sorted(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        /*
         * if (sorted(arr)) {
         * System.out.println("yes");
         * }
         * 
         * else {
         * System.out.println("No");
         * }
         */

        boolean flag = sorted(arr);

        if (flag) {
            System.out.println("yes");
        }

        else {
            System.out.println("No");
        }

    }
}
