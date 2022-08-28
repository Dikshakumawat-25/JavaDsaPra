import java.util.*;
public class aniquesubseq {
        public static void subseq(String str,int idx,String newString,HashSet<String> set){
            if(str.length()==idx){
                if(set.contains(newString)){
                    return ;
                }
                else

                System.out.println(newString+"");
                set.add(newString);
                return;
            }
            char curchar=str.charAt(idx);
            subseq(str,idx+1,newString+curchar,set);
            subseq(str,idx+1,newString,set);
        }
        public static void main(String []args) throws Exception{
            String str="aaaaaaaaaaaaaa";
            HashSet<String> set=new HashSet<String>();
            subseq(str,0,"",set);
        }
    }

