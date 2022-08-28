public class TowerHatoi {

        public static void toh(int N, String from, String to, String aux) {
            // Your code here
            if(N==1){
                System.out.println("move disk "+ N +" from rod "+ from +" to rod "+ to);
                return ;
            }
            toh(N-1,from,aux,to);
            System.out.println("move disk "+ N +" from rod "+ from +" to rod "+ to);
        
               toh(N-1, aux,to,from);
        
        }
       public static void main(String []args){
           int n=3;
           toh(n,"s","h","d");
       } 
    }
    

