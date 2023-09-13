class Searching{




    static Boolean BinaryS(int arr[]){
    int low = 0 ;
    int high = arr.length-1 ;
    int mid = (low + high )/2;

    

        for( int i = 0 ; i <arr.length ; i++){

            if ( arr[i] == mid ){
                return true ;
            }
            else if (arr[i] > mid  ){
                low = mid +1 ;

            }
            else {
                high = mid -1 ;
            }
        }

        return false ;
    }

    static Boolean LinearS(int arr[]){
        for ( int i = 0 ; i < arr.length ; i++){

            int count= 0 ;
            if(arr[i]==50 ){

                System.out.println(i);
                return true;
            }
        }
        
        return false ;
    }



    public static void main(String[] args) {

        int arr[]={10,100, 3,1,22,11};
        int s = arr.length;
        System.out.println(LinearS(arr));
        
    }
}