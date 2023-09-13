public class PairsinArray {

    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        int n= arr.length;

        for(int i=1 ; i<= n ;i++){
            for(int j=i+1 ; j<= n; j++){
        
                   System.out.print("("+i+","+j+")");
             
            }
            System.out.print("\n");
        }
    }
    
}
