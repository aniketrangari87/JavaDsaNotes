public class RatImMazeOptm {

    public static void main(String[] args) {
        
        int r = 3 ; 
        int c = 4;
        int maze [][] = {{1,0,1,1},
                        {1,1,1,1},
                        {1 ,1,0,1}};

      
        maze(0,0,r-1,c-1,"",maze);



    }
    public static void maze( int sr, int sc , int er , int ec ,String s ,int maze[][] ){

        if(sr < 0 || sc < 0 )return ;
        if(sr>er || sc >ec )return ;
       
        if(maze[sr][sc]== 0)return ;
        if(maze[sr][sc] == -1)return;

        if( sr == er && sc ==ec ){
            System.out.println(s);
            return ;
        }
        maze[sr][sc] =-1;
        // right 
        maze( sr,  sc+1 ,  er ,  ec , s+"R",maze);
        // down 
        maze( sr+1,  sc ,  er ,  ec , s+"D" ,maze);
        // left 
        maze( sr,  sc-1 ,  er ,  ec , s+"L" ,maze);
        // up
        maze( sr-1,  sc ,  er ,  ec , s+"U" ,maze);
        maze[sr][sc] =1;
    }
    
}
