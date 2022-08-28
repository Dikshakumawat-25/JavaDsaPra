public class Removedublicate {
    public static boolean[] map=new boolean[26];
    public static void DuplicateR(String str,int idx,String newString ){
        if(str.length()==idx){
            System.out.println(newString+"");
            return ;
        }
        char current=str.charAt(idx);
        if(map[current-'a']){
            DuplicateR(str, idx+1, newString);
        }
        else{
            newString+=current;
            map[current-'a']=true;
            DuplicateR(str,idx+1,newString); 
        }
    }
    public static void main(String []args){
    String str="abbcdda";
    DuplicateR(str,0,"");
    }
}
