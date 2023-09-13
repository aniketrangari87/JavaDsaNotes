class arrays {

    // First repeat 

    static int firstRepeat( int arr[]){


        for( int i =  0 ; i < arr.length ; i++){
            for ( int j = i+1 ; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                
                }
            
            }
        }

        return -1;
    }
    // Find min 
    static int min(int arr[]){
        int min= Integer.MAX_VALUE;


        for ( int i = 0 ; i < arr.length ; i++ ){
            if( arr[i] < min){
                min= arr[i];
            }
        }

        return min ;
    }
    // Second min 

    static int secondMin( int arr[]){
        int min = min(arr);

        for(int i =0 ; i < arr.length ; i++){
            for( int j =i + 1  ; j < arr.length ; j++){
                if( arr[i] == min){
                    arr[i]=Integer.MAX_VALUE;
                }
            }
        }
        int smin = min(arr);
        return smin ;
    }



    // find max 

    static int max( int arr[]){
       int mx = Integer.MIN_VALUE;

       for(int i =0 ; i < arr.length ; i++ ){
        if(arr[i] > mx ){
            mx = arr[i];
        }
       }

       return mx ;
    }

    static int secondMax( int arr[]){
        int mx= max(arr);

        for(int i =0 ; i < arr.length ; i++ ){
            if( arr[i]== mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int sm = max(arr);
        return sm;
    }

    // Find Unique
    static int findUnique(int arr[]){

        for(int i =0 ; i< arr.length ; i++ ){

            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

        }

        int ans = 0 ;
        for( int i =0 ; i< arr.length ; i++){
            if( arr[i] > 0 ){
                ans = arr[i];
            }
        }
        return  ans ;
    }

    

     static int targetSum( int arr[] , int k){

        int count = 0 ;

        for( int i = 0 ; i< arr.length ; i++){
            for ( int j = i + 1 ; j< arr.length ; j++){
                if((arr[i] + arr[j]) == k){
                    count++ ;
                }
            }

        }
        

        return count ;
    }

    static int tripletSum(int arr[] , int key ){
        int count = 0 ; 

        for(int i = 0 ; i < arr.length ; i++){
           for(int j  = i+1 ; j< arr.length ; j++){
            for( int k = j+1 ; k< arr.length ; k++){

                if((arr[i]+ arr[j]+arr[k])==key){
                    count++;
                }

            }

           

           }


        }
        return count ;
    }
    


    public static void main(String[] args) {
        int arr[]={3,4,5};
        System.out.println(secondMin(arr));
    }
    
}