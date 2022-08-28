class subsequance{
    public static void subseq(String str,int idx,String newString){
        if(str.length()==idx){
            System.out.println(newString+"");
            return;
        }
        char curchar=str.charAt(idx);
        subseq(str,idx+1,newString+curchar);
        subseq(str,idx+1,newString);
    }
    public static void main(String []args){
        String str="abc";
        subseq(str,0,"");
    }
}