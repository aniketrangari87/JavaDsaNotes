import java.util.Arrays;

class array{

    // Smallest and Largest Element 
    static int[] smallestAndLrgestElement(int arr[]) {
        Arrays.sort(arr);

        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;

    }
    static int[] kthsmallestAndLrgestElement(int arr[],int k) {
        Arrays.sort(arr);

        int[] ans = {arr[k-1], arr[arr.length-k]};
        return ans;

    }
    

    // Sorted or not 

    static Boolean isSorted(int arr[]){

        for(int i = 1; i< arr.length ;  i++){
            if( arr[i] < arr[i-1 ]){
                return false;
            }

        }
        return true;
    }




    // Count of numbers Strictly greater than key 
    static void greaterNumbers(int arr[], int key ){
        int count = 0 ;
        for( int i =0 ; i < arr.length ; i++){
            if(arr[i] >key ){

                count++ ;

            }
        }
        System.out.println("Greter number Count is : "+  count );
    }

    // Last index of occurance 

    static void lastIndex(int arr[] , int key ){
        int lastIndex=  0 ;
        
        for ( int i= 0 ; i< arr.length ; i++){
            
        if ( arr[i] == key ){
         
            lastIndex=i;


        }
        }
        System.out.println("LastIndex : "+ lastIndex);
    }
    // Count the element int he arry 

   static void count ( int arr[] , int key ){
    int count = 0 ;
    for ( int i = 0 ; i < arr.length ; i++){

        if(arr[i] == key ){
            count++;
        }
        

    }
    System.out.println("Count of "+key+ ":" + count );
   }
  

    // Sum of the elements in the array 
 static void sumArray(int arr[]){
    int sum =0 ;
    for( int i = 0 ; i < arr.length ; i++){
        
        sum +=arr[i];  
    }
    System.out.println("Sum : "+ sum);
 }

 // Maximum in the array 
static void maxArray (int arr[]){

    int max = arr[0];

    for(int i =0 ; i < arr.length ; i++){
        if(arr[i] >max){
            max=arr[i];
        }
        
    }
System.out.println("Max : "+max);
}

  // minimum in the array 
static void minArray  (int arr[]){

    int min = arr[0];

    for(int i =0 ; i < arr.length ; i++){
        if(arr[i] <min){
            min=arr[i];
        }
        
    }
System.out.println("Max : "+min);
} 
     // Searching the array 

     static int searchArray ( int arr[] ,int key ){
            for ( int i =0 ; i < arr.length ; i++){
                if (arr[i]==key ){
                    return i;
                }
            }
        return -1;
     }

    static void printArray(int arr[]){
        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
       
        // // Example of shaollo copy 
        // int arr1[]={1,2,3,4,5,6,7,8,9,10};
        // int arr2[]=arr1;

        // arr2[7]=90;
        // printArray(arr1);
        // printArray(arr2);

   // Example of the Deep Copy 
    String arr1[]={"1" ,"3"};
      
    
        // printArray(arr1);
        // printArray(arr2);


        // Util Arrays class 
//         int arr3[]=Arrays.copyOf(arr2, 4);
//    printArray(arr3);
//         int arr4 [] = Arrays.copyOfRange(arr1, 0 ,7);
        // printArray(arr4);

        // greaterNumbers(arr1, 2);
        // int newarr[]=kthsmallestAndLrgestElement(arr1,2);
        printArray(newarr);



        
        
    }
}