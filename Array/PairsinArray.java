public class PairsinArray {

    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        int n= arr.length;

        for(int i=0 ; i< n ;i++){
            for(int j=i ; j<  n; j++){
           for( int k = i ; k<= j;k++){
            if(arr[i] != arr[j]){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
           }
                 System.out.print("\n");  
             
            }
            System.out.print("\n");
        }
    }
    
}
