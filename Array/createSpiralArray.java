public class createSpiralArray {

    static int [][] spiralArray( int n){
        int ans[] [] = new int[n][n];
        int topRow = 0  , bottomRow=n-1 , leftcol=0, rightCol=n-1;

        int cur = 1 ;
        while( cur <= n*n){

            // topRow --> leftCol to rightCol
            for (int i = leftcol ; i<=rightCol && cur<= n*n ; i++){
                ans [topRow][i]=cur++;
            }
            topRow++;
            // rightCol --> topRow to bottomRow
            for (int i = topRow ; i<=bottomRow && cur<= n*n ;i++  ){
                ans [i][rightCol]=cur++;
            }
            rightCol--;
            // bottomrow --> rightCol to leftcol
            for (int i = rightCol ; i>= leftcol && cur<= n*n  ; i--){
                ans[bottomRow][i]=cur++;
            }
            bottomRow--;
            //leftCol --> bottomrow to topRow
            for (int i = bottomRow ; i>= topRow && cur<= n*n  ; i--){
                ans[i][leftcol]=cur++;
            }
            leftcol++;
        }
        return  ans ;
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
        int ans[][]= spiralArray(10);
        printArray(ans);


    }
}
