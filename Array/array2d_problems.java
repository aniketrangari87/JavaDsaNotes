class array2d_problems{
     static void printSpiralOrder(int arr[][] , int r , int c ){

         int topRow= 0 ,bottomRow = r-1 , leftCol= 0 ,rightCol = c-1;
         int totalElements = 0 ;


         while(totalElements < r*c ){
             // topRow --> leftCol to rightCol

             for (int i = leftCol ; i<= rightCol ; i++){
                 System.out.print(arr[topRow][i] + " ");
                 totalElements++;
             }
             topRow++;
             // rightCol --> topRow to bottomRow
             for (int i = topRow ; i<= bottomRow ; i++){
                 System.out.print(arr[i][rightCol] + " ");
                 totalElements++;
             }
             rightCol--;
             // bottomRow --> rightcol to leftCol
             for (int i = rightCol ; i>= leftCol ;i-- ){
                 System.out.print(arr[bottomRow][i] + " ");
                 totalElements++;

             }
             bottomRow--;


             // leftCol --> bottomRow to topRow
             for (int i = bottomRow ; i>= topRow ; i--){
                 System.out.print(arr[i][leftCol] + " ");
                 totalElements++;

             }
             leftCol++;
         }
     }
     static int[][] pascleTriangle( int n ){
         int ans[][] = new int [n][];


         for (int i = 0 ; i < n ; i++){
             // Jagged array
             ans[i]= new int[i+1];
             // First and last element is 1
             ans[i][0]=ans[i][i]=1;
             // traingle
             for (int j = 1 ; j< i ; j++){
                 ans[i][j]=ans[i-1][j] + ans[i-1][j-1];
             }

         }







         return  ans ;
     }
    static void reverseArray(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while(i < j ){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

        // Rotate
    static void rotate( int arr[][] , int n ){
        //transpose
        transposeInPlace(arr,n , n);
        //reverse the row of transposed matrix
        for (int i = 0 ; i<n ; i++){
            reverseArray(arr[i]);

        }

    }
    // Only applicable for the square matrix
    static int[][] tranposeOfArray(int arr[][] , int r , int c ){
        int ans [][]= new int [c][r];
        for (int i = 0 ; i< r ; i++){
            for (int j = 0 ; j< c ; j++){
                 ans[i][j]=arr[j][i];
            }
        }

        return  ans ;
    }
    static  void transposeInPlace(int arr[][],int r , int c ){

        for (int i = 0 ; i< r ; i++){
            for (int j = i ; j< c ; j++ ){
                //swap
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
     static void printArray(int arr[][]){
        System.out.println("Array is : ");
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println("");
        }


    }

    public static void main(String[] args) {

        int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printArray(arr);
       printSpiralOrder(arr,4,4);



    }
}
