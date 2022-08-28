class sample{
    public static int countpath(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 || j==n-1){
            return 1;
        }
        int downpath=countpath(i+1,j,n,m);
        int rigthpath=countpath(i,j+1,n,m);
        return downpath+rigthpath;
    }
    public static void main(String [] args){
        int n=3,m=4;
        int totalpath=countpath(0,0,n,m);
        System.out.println(totalpath+" ");
    }
}/