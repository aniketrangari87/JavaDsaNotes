import java.util.Scanner;

public class array_2d {
    public static int[][] multiplicationOfArrays(int arr1[][],int r1 , int c1 , int arr2[][],int r2 , int c2){
        int ans [][] = new int[r1][c2];

        if(c1 == r2){
            for (int i = 0 ; i< r1 ; i++){
                for (int j = 0 ; j< c2 ; j++){
                    for (int k = 0 ; k < c1 ; k++){
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

        }else{
            System.out.println("Invalic array dimentions !!");
        }
        return ans ;
    }
    public static int[][] additionOfArrays(int arr1[][],int r1 , int c1 , int arr2[][],int r2 , int c2 ){
        int ans[][] = new int [r1][c1];
        if (r1 == r2 && c1 == c2 ){
            for (int i = 0 ; i< r1; i++){
                for (int j = 0 ; j< c1 ; j++){
                 ans[i][j]   = arr1[i][j] + arr2[i][j];
                }
                System.out.println("");
            }
        }else{
            System.out.println("For addition the dimention of arrays should same ");
        }

   return  ans;
    }

    public static void printArray(int arr[][]){
        System.out.println("Array is : ");
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println("");
        }


    }
    public static int[][] oddOrEven(int arr[][]){


        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j< arr[i].length ; j++){
                if(arr[i][j]%2 == 0 ){
                    arr[i][j]=1 ;
                }
                else{
                    arr[i][j]=0;
                }
            }
            System.out.println("");
        }
        return arr;
    }
    public static int [][] diagonalElements(int arr[][]){
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j< arr[i].length ; j++){
                if(arr[i] == arr[j] ){
                    arr[i][j]=1 ;
                }
                else{
                    arr[i][j]=0;
                }
            }
            System.out.println("");
        }



        return  arr;

    }


    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

//        System.out.println("Enter the rows:");
//        int r = sc.nextInt();
//        System.out.println("Enter the columns :");
//        int c = sc.nextInt();
//
//        int arr [][] = new int[r][c];
//
//        System.out.println("Enter the elements of the array :" );
//        for (int i = 0 ; i< r ; i++){
//            for (int j = 0 ; j< c ; j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }

        int arr1 [][]={{1,2 ,3},{3,4,5},{6,7,8}};
        int arr2[][]={{1,2 ,3},{3,4,5},{6,7,8}};

        int ans[][]=multiplicationOfArrays(arr1,3,3,arr2,3,3);
        printArray(ans);




    }
}
