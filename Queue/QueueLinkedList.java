

public class QueueLinkedList {


    public static class Node {
        private int data;
        Node next ;

         Node(int data){
            this.data=data;
        }

    }
    public static class q{
         Node head = null; 
        Node tail = null ; 
        int size = 0 ;

       

        void add(int data){
            Node temp = new Node(data);
            if(size == 0 ){
                head = tail = temp;
            }else{
                tail.next= temp ;
                tail=temp;
            }
           size++;
        }

        int peek (){
            if(size ==0 ){
                System.out.println("Empty ");
                return -1 ;
            }
                return head.data;


        }

        int remove (){
             if(size ==0 ){
                System.out.println("Empty ");
                return -1 ;
            }
            int x = head.data;
            head = head.next;

            size--;
            return x ;

        }

        void display(){

            if(size == 0){
                System.out.println("is Empty");
            }
            Node temp = head ;

            while(temp != null){
                System.out.print(temp.data+"->");
                temp=temp.next;

            }
    }

}
  public static void main(String[] args) {
        q a =new q();

        a.add(100);
        a.add(200);
        a.add(300);
        a.add(400);
        a.add(500);
        a.add(600);
        a.display();
        a.remove();
        System.out.println();
        a.display();
        
       }
     

}
