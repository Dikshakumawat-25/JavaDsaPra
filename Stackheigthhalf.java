public class Stackheigthhalf {
    public static int squar(int a,int b){
        if(b==0){
        return 1;
        }
       if(b%2==0){
       return squar(a,b/2)*squar(a,b/2);
       }
       else
       { 
       return a*squar(a,b/2)*squar(a,b/2);
       }
    }

    public static void main(String []args){
        int a=2,b=5;
       int res= squar(a,b);
       System.out.println(res+" ");
    }
}
