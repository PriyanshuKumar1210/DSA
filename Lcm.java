public class Lcm {

    public static int lcm(int a,int b){
        int res = Math.min(a, b);
        while(res>0){
            
            if(res % a ==0 && res % b ==0){
                    break;
            }
                    res++;
        }
            return res;
    }
    public static void main(String[] args) {
        int res = lcm(4,6);
        System.out.println("Lcm : "+res);
    }
}
