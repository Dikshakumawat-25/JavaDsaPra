//place tile of size 1xm in afloor of size m*n 
public class counttilesize {
    public static int placetiles(int n,int m){
        if(n<m)
        {
            return 1;
        }
       else if(n == m){
            return 2;
        }
       
        int vertplacements=placetiles(n-m,m);
        int horiplacements=placetiles(n-1,m);
        return vertplacements+horiplacements;

    }
    public static void main(String []args){
         int n=4,m=2;
         System.out.println(placetiles(n,m));
    }
}
