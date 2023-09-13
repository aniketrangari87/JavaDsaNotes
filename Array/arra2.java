 class arra2 {

    // rotate inspace 
    static void reverseArray(int arr[] ){


        int n = arr.length;

        for (int i = 0  ; i< n/2 ; i++){
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1] = temp ;

        }

      
   }
   static void rotateInPlace( int arr[] , int k ){

    int n = arr.length ;
    k =  k % n ;
    // reverseArray(arr, 0 , n-k-1);
    // reverseArray(arr, n-k, n-1);
    // reverseArray(arr, 0 , n-1);
   }



 ///simple extra space rotate 
    static int[] rotate(int arr[] , int k ){
        int n = arr.length;
        k = k%n;
        int j =0 ;

        int ans []= new int[n];

        for ( int i = n-k ; i< n ; i++){
        ans[j++]=arr[i];
        }
        for ( int i = 0; i< n-k ; i++){
        ans[j++]=arr[i];
        }

        return ans ;
    }

   static void swapArray(int arr[], int i , int j ){
    
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]=temp;
   }
//    // reverse by in same array 
//    static void reverseArray(int arr[]){
//     int i = 0 ; 
//     int j = arr.length - 1 ;

//     while(i<j){
//         swapArray(arr, i , j );
//         i++;
//         j--;
//     }
//    }

     static int [] reverse(int arr[]){
        int ans[]= new int[arr.length];

        int j = 0;
        for (int i = arr.length -1 ; i>= 0  ; i--){

            ans[j++]=arr[i];

        }


        return ans;
     }

    static void swap(int a , int b ){
        int temp =a;
        a = b ;
        b = temp ;  
        
    System.out.println(a + " "+ b);
    } 
    static void addswap(int a  , int b ){
        a = a+ b ;
        b= a - b;
        a = a-b ;
 System.out.println(a + " "+ b);

        
    }
    static void printArray(int arr[]){
        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


    


    public static void main(String[] args) {

        
        int arr[]={1,2,3,4,5};
       
        //  System.out.println(a + " "+ b);
        //  addswap(a,b);
        //  int arra[]= reverse(arr);    
        //      printArray(arra);

     
         reverseArray(arr);
         printArray(arr);

        
    }
    
}
