import java.util.LinkedList;
import java.util.Queue;
public class Queues {

    public static class Que {

        private int f =-1 ;
        private int r = -1;
        
        int s = 0;
        int[] q = new int[100];

        
        // Insert the Element 
        void push(int x) {
            if (r == q.length-1) {
                System.out.println("Overflow");
                return;
            }
            if(f==- 1){
                r=  f = 0 ;
                q[0]=x;
            }
            
            else {
                q[++r] = x;

                
            }
           s++;
        }

        // Delete the Element 

        int pop(){   
            if(s==0){
                return -1 ;
            }
                int x = q[f];
                f++;

        
            return x ;
        }

        // Display Queue Elements 

        void display(){

            for( int i = f ; i<=r  ; i++){
                System.out.print(q[i] + " ");
            }
        }
       // Peek operation 
       int peek(){
        return q[f];
    }


    }

    public static void main(String[] args) {

        Que q = new Que();
        Queue <Integer> o = new LinkedList<>();
        

        q.push(100);
        q.push(200);
        q.push(300);
        q.push(400);
        q.push(500);
        q.pop();
        q.pop();

        q.display();
        System.out.println();
        System.out.println(q.peek());

    }
}