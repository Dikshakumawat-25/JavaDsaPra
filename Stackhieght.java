public class Stackhieght {
    public static int squar(int a,int b){
        if(b==0){
        return 1;
        }
        if(a==0)
        {
            return 0;
        }
        squar(a,b-1);
        int xn=a*a;
        return xn;
    }

    public static void main(String []args){
        int a=2,b=5;
       int res= squar(a,b);
       System.out.println(res+" ");
    }
}
