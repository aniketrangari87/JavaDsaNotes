public class CircularQueue {


   public static class Cqueue{
    int front = -1;
    int rear =-1;
    int size = 0 ;

    int arr[]= new int[8];


    public void add(int x ) throws Exception{

        if(size == arr.length ){

            throw new Exception("Queue is full");

        }
        else if ( size == 0 ){
            front = rear = 0 ;
            arr[0] = x ;
        }
        else if (rear < arr.length ){
            arr[++rear] = x ;
        }else if( rear == arr.length ){
            rear= 0 ;
            arr[0]= x ;
        }
        size++;
    }

    public int remove () throws Exception {
        if(size == 0 ){

            throw new Exception("Queue is Empty ");
        }
        else if ( front  == arr.length -1){
            int val =arr[front];
            front = 0;
            return val;
        }
        int val =arr[front ];
        front++;
        size--;
        return val ;
    }

    public int  peek() throws Exception{
           if(size == 0 ){

            throw new Exception("Queue is Empty ");
        }
            return arr[front ];
    

    }

    public void display(){
        if(size == 0 ){
            System.out.print("Queue is empty ");
        }
        else if( front <= rear ){

            for( int i = front ; i <= rear ; i++){
                System.out.print(arr[i] + " ");
            }

        }
        else {
            for( int i = front ; i < arr.length ; i++){
                 System.out.print(arr[i] + " ");
            }
            for( int i = 0 ; i <= rear ; i++){
                  System.out.print(arr[i] + " ");
            }
        }

    }
   }
    
    public static void main(String[] args)  throws Exception {

        Cqueue q = new Cqueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println();
        q.remove();
        q.remove();
        q.peek();
        q.display();

   
        

    }
}
