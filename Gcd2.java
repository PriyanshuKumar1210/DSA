public class Gcd2 {

    public static int gcd(int a,int b){
            if(b==0){
                return a;
            }
            else
                return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int res = gcd(24,18);
        System.out.println(res);
    }
}