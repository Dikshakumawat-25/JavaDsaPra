//print all permutation of string
public class printallpermutation {
    public static void prpermutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation+"");
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            prpermutation(newString,permutation+currchar);
        }
    }
    public static void main(String []args){
        String str="abc";
        prpermutation(str,"");
    }
}
