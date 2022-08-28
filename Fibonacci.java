public class Fibonacci {
    public static void Fibonacciseries(int a,int b,int c,int n){
        if(n==0){
        System.out.print(a+" ");
        return ;
        }
        System.out.print(a+" ");
         a=b;
         b=c;
         c=a+b;
        Fibonacciseries(a,b,c,n-1);
        
    }
    public static void main(String []args){
        Fibonacciseries(0,1,1,7);
    }
}
