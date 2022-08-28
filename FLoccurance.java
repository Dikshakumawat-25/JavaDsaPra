//import java.sql.SQLTransientConnectionException;

 class FLoccurance {
    //first and last occurance
    static  int first=-1;
    static  int last=-1;
    public static void getoccurance(String str,int idx,char element){
    if(str.length()==idx){
         System.out.print(first +" ");
         System.out.print(last+" ");
         return; 
    }
    char current=str.charAt(idx);
    if(current==element){
        if(first==-1){
            first=idx;
        }
        else{
            last=idx;
        }

    }
    getoccurance(str, idx+1, element);
    }
    public static void main(String args[]){
        String str="abdaaacdaae";
        getoccurance(str, 0, 'a');
    }
}
