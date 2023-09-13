class BubbleSort {


    // QUESTIONS 02 : STRING IN THE ARRAY WITH LEXICOGRPHICAL ORDER
    
    
    static void lexicoGraphString(String []s){
        int n = s.length;
    

        for( int i = 0 ; i< n-1; i++){
            int min_index=i;

            for(int j = i+1 ; j<n ; j++){
                if(s[j].compareTo(s[min_index] )<0){
                 min_index=j;
                }
            }


            String temp =s[i];
            s[i]=s[min_index];
            s[min_index]=temp;
        }


    }

    // QUESTIONS 01 : MOVES ALL THE ZEROS IN THE ARRAY TO THE LAST OF THE ARRAY 

       static void moveZerosToLast(int arr[]){
        int n = arr.length;
        boolean flag=false;

        for( int i = 0 ; i< n ; i++){

            for ( int j = 0; j <n-i-1 ; j++){
                if(arr[j]==0 && arr[j+1 ]!= 0 ){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            while( !flag){
                return;
            }

        }
       }

    // Insertion Sort
    static void insertionSort(int arr[]) {
        int n =arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;
            while ( j > 0 && arr[j] < arr[j - 1]  ) {

                int temp = arr[j];  
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        // For current index

        for (int i = 0; i < n - 1; i++) {

            int min_index = i;
            // Finding the minimum element in the next unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // Swapping the index values

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

    }

    // Bubble Sort with best case as O(n)
    static void bubbleSort(int a[]) {

        int n = a.length;

        for (int i = 0; i < n - 1; i++) {

            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }

        }

    }

    public static void main(String[] args) {
        String a[] = { "prajwal", "anik et" ,"ram" , "shubhash ", "sanket","kunal"};

        lexicoGraphString(a);

        for (String x : a) {
            System.out.print(x + " ");

        }
    }
}