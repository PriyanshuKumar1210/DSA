public class ComputingPower {

    public static int power(int n,int x){
        int res =1;

        for(int i=1;i<=x;i++)
            res=res*n;

        return res;
    }
    public static void main(String[] args) {
        int n=2,x=3;
        int b = power(n,x);
        System.out.println(b);
    }
}
