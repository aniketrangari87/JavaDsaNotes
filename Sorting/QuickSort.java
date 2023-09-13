class QuickSort { 



    static int  partition(int arr[], int i , int j ){

        int pivot = arr[i];
        int count = 0 ;
        

    }

    static void quickSort( int arr[] , int i , int j ){

        int pi= partition(arr,i,j);
        quickSort(arr, i,pi-1);
        quickSort(arr, pi+1, j);
    }




    void swap(int arr[], int i , int j ){
       
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;



    }


    public static void main(String[] args) {
        
    }
}