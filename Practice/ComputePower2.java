public class ComputePower2 {

    public static int power(int x,int n){

        if(n==0)
            return 1;
        int temp = power(x,n/2);
        temp = temp*temp;

        if(n%2==0)
            return temp;
        else
            return temp*x;

    }
    public static void main(String[] args) {
        int n=2,x=3;
        int b = power(x,n);
        System.out.println(b);
    }
}
