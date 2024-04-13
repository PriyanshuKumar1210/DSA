public class Gcd3 {

    public static int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
            return a;
    }
    public static void main(String[] args) {
        int res = gcd(18,24);
        System.out.println(res);
    }
}
