//find the number of ways in which you can invite n people to your party single or in pairs
class recursion{
    public static int callGuasts(int n){
    if(n<=1)return 1;
    int way1=callGuasts(n-1);
    int way2=(n-1)*callGuasts(n-2);
    return way1+way2;
    }
        public static void main(String []args){

        
        int n=4;
        System.out.println(callGuasts(n));
        }
}