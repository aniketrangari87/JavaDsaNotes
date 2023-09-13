import java.util.Scanner;




class TestArrat {

    // InPlace makePrefixSum
    static int[] inPlacePrefixSum( int arr[]){

        int n = arr.length ;
        

        for( int i =1 ; i< n ; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }


    // Prefix sum of the elemnts in the array 

    static int[] makePrefixSum(int arr[]){
        int n = arr.length;
        int[] Prefix = new int[n];
        Prefix[0]=arr[0];

        for(int i = 1; i < n ; i++){
            Prefix[i]=Prefix[i-1]+arr[i];
        }

        return Prefix;
    }
    static void swapArray(int arr[], int i , int j ){
    
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]=temp;
   }
     static void reverseArray(int arr[]){
    int i = 0 ; 
    int j = arr.length - 1 ;

    while(i<j){
        swapArray(arr, i , j );
        i++;
        j--;
    }
   }


    // arr in non decreasing square order

    static int[] sortSquare(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];

        int left = 0, right = n - 1;
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;


            }
        }
        
        return ans;
    }

    // Swap
    static void swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // zero and one sort
    static void sortingZeroAndOne(int arr[]) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;

            }
        }
    }

    // zero and one sort with parity
    static void sortingZeroAndOneParity(int arr[]) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;

            }
        }
    }

    // Sort zeros and on
    static void sortZerosAndOne(int arr[]) {
        int n = arr.length;

        int zeros = 0;

        // count zeros
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        // make array
        for (int i = 0; i < n; i++) {
            if (i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }

    static void printArray(int arr[]) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] =inPlacePrefixSum(arr);
        
        printArray(ans);
    }

}
