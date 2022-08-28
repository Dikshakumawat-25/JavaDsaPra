import javax.print.event.PrintEvent;

//Print Sum 1 to 5
public class Sum {
    public static void sumnumb(int i,int n,int sum){
    if(i==n){
sum=sum+i;
System.out.print(sum+" ");
return;
    }
    sum=sum+i;
    sumnumb(i+1,n,sum);
    }
    public static void main(String []aargs){
     sumnumb(1,5,0);
    
    }
    
}
