public class FourDirectionMaze {
    

    public static void main(String[] args) {
        
        int r = 3 ; 
        int c = 3 ;
        boolean isVisited[][]= new boolean[r][c];
        maze(0,0,r-1,c-1,"",isVisited);



    }
    public static void maze( int sr, int sc , int er , int ec ,String s ,boolean isVisited[][] ){

        if(sr < 0 || sc < 0 )return ;
        if(sr>er || sc >ec )return ;
        if( isVisited[sr][sc]==true )return ;

        if( sr == er && sc ==ec ){
            System.out.println(s);
            return ;
        }
        isVisited[sr][sc] =true;
        // right 
        maze( sr,  sc+1 ,  er ,  ec , s+"R",isVisited);
        // down 
        maze( sr+1,  sc ,  er ,  ec , s+"D" ,isVisited);
        // left 
        maze( sr,  sc-1 ,  er ,  ec , s+"L" ,isVisited);
        // up
        maze( sr-1,  sc ,  er ,  ec , s+"U" ,isVisited);
        isVisited[sr][sc] =false;
    }
}
