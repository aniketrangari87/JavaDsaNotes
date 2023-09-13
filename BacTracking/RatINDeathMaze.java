public class RatINDeathMaze {
    


    public static void main(String[] args) {
        
        int rows  = 3 ;
        int cols = 4 ;
        int maze [][] = {{1,0,1,1},
                         {1,1,1,1},
                         {0,1,1,1}};

        print(0 , 0, rows-1,cols-1,"",maze);           
    }
    public static void print(int sr , int sc , int er , int ec  , String s , int [][]maze ){
        if(sr > er || sc > ec )return ;

        if( sr == er && sc == ec ){
            System.out.println(s);
            return ;
        }
        if( maze [sr][sc ]==0)return ;

        // right 
        print(sr+1 , sc ,er ,ec,s+"R",maze);
        //down 
        print(sr , sc+1 ,er ,ec,s+"D",maze);

    }
}
