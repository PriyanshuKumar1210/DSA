public class PrintNumber1 {
    public static int find_fact(int n){
        // int fact=1;
        if(n==1)
            return 1;
        
        int fact = n*find_fact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        int result = find_fact(n);
        System.out.println(result);
    }
}
