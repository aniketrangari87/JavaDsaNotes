public class countPathInMaze {


public static int coutPath(int i , int j , int n , int m){


    //Base Case 
    if( i == n || j == m){
        return 0 ;
    }
    if(i == n-1 && j == m-1 ){
        return 1 ;
    }

    // Self and Recursive Work 

    int downPath = coutPath(i+1 , j , n , m);
    int rightPath = coutPath(i , j+1 , n , m);

    return downPath+rightPath;
}



    public static void main(String[] args) {

        int n = 3 ,m = 3 ;
        System.out.println(coutPath(0, 0, 3, 4));
        

        
    }
    
}
