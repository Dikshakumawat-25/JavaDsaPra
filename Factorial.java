public class Factorial {
    public static void factnumb(int i,int n,int fact){
          if(i==n){
              fact*=i;
              System.out.print(fact+" ");
              return ;
          }
          fact*=i;
          factnumb(i+1,n,fact);
    }
    public static void main(String []args){
        factnumb(1,5,1);
    }
}
