public class RatInDEathMase4 {
    

    public static void main(String[] args) {
        
        int r = 3 ; 
        int c = 4;
        int maze [][] = {{1,0,1,1},
                        {1,1,1,1},
                        {1 ,1,0,1}};

        boolean isVisited[][]= new boolean[r][c];
        maze(0,0,r-1,c-1,"",maze,isVisited);



    }
    public static void maze( int sr, int sc , int er , int ec ,String s ,int maze[][],boolean isVisited[][] ){

        if(sr < 0 || sc < 0 )return ;
        if(sr>er || sc >ec )return ;
        if( isVisited[sr][sc]==true )return ;
        if(maze[sr][sc]== 0)return ;

        if( sr == er && sc ==ec ){
            System.out.println(s);
            return ;
        }
        isVisited[sr][sc] =true;
        // right 
        maze( sr,  sc+1 ,  er ,  ec , s+"R",maze,isVisited);
        // down 
        maze( sr+1,  sc ,  er ,  ec , s+"D" ,maze,isVisited);
        // left 
        maze( sr,  sc-1 ,  er ,  ec , s+"L" ,maze,isVisited);
        // up
        maze( sr-1,  sc ,  er ,  ec , s+"U" ,maze,isVisited);
        isVisited[sr][sc] =false;
    }
}
