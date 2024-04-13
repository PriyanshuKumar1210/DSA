public class PowerRecursion {
    public static int power(int x,int n){
        
        if(n==0)
            return 1;
        
        if(x==0)
            return 0;
        
        int xpow1 = power(x, n-1);
        int xpow = x*xpow1;

        return xpow;
    }
    public static void main(String[] args) {
        int x=2,n=3;
        power(x,n);
    }
}
