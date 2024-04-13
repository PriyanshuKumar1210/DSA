public class ComputePower3 {
    public static int power(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
                x = x * x;
                n = n / 2;
            
                
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5, x = 4;
        int b = power(x, n);
        System.out.println(b);

    }

}
