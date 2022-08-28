

public class Sorttedarr {
    public static boolean sortedarray(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){

        
        return sortedarray(arr, idx+1);
        }
        else
        return false;
    }
    public static void main(String []args){
 int []array={1,2,3,4,5,6,7};
 boolean b=sortedarray(array, 0);
 System.out.print(b+"");
    }
}
