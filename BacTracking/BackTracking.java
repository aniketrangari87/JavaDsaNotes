public class BackTracking{


    public static void main(String[] args) {
        int n = 2 ;
        int m = 2 ;

        int count = maze(1,1,2,2);
        System.out.println(count);
    }
    public static int maze(int i , int j ,int n , int m){

        if(i >  n || j > m ){
            return 0 ;
        }
        if(i == n &&  j == m){
            return  1;
        }
      
        int downWays = maze(i+1 , j , n , m );
        int rightWays = maze (i , j+1 , n , m);
        int totalWays = downWays+ rightWays;
         
        return totalWays ;
    }
}