class CountSort{
     

    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;

        for( int i = 0 ; i< arr.length ; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }



    public static void basicCountSort(int arr[]){
       
        int max = findMax(arr);  // find Max  2 4 2 2 

        int count[] = new int[max+1];
        for( int i = 0 ; i< arr.length; i++){ // 
            count[arr[i]]++;
        }
        int k = 0 ;

        for( int i =  0 ; i<count.length ; i++){

            for(int j = 0 ; j < count[i] ; j++){

                arr[k++]=i;
            }
        }
    }

    static void CountSort(int arr[]){
        int n= arr.length;
        int []output=new int[n];
        int max = findMax(arr);  // find Max  2 4 2 2 

        int count[] = new int[max+1];
        for( int i = 0 ; i< arr.length; i++){ // Frequency array
            count[arr[i]]++;
        }
        for( int  i =1 ; i < count.length ; i++){
            count[i]+=count[i-1];
        }

        for(int i = n-1 ; i>= 0 ; i--){
            int ind = count[arr[i]]-1;
            output[ind]=arr[i];
             count[arr[i]]--;


        }
        for( int i = 0 ; i< n ; i++){
            arr[i]=output[i];
        }



    }
      static void display( int arr[]){

  
            for( int x : arr){
    
                   System.out.print(x + " ");
    
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int arr[]={4,3,1,5,3,3,5};
        CountSort(arr);
        display(arr);


    }
}