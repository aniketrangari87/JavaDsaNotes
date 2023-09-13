    public class LinkedListStack{

        public static class Node{

            int data ;
            Node next ;
            Node ( int data)
            {
                this.data=data;
            }
        }

         public static class Stack{
            Node head = null;
            int size= 0;


            void push(int data){
                Node temp = new Node(data);

                temp.next= head ;
                head = temp ;
                size++;
            }
            void display (){
                displayRec(head);
                System.out.println(" ");
            }
            void displayReverse (){
                Node temp = head ;
                while( temp != null){
                    System.out.print(temp.data+"->");
                    temp=temp.next;
                }
                System.out.print("null");
               
            }
            void pop(){
                head=head.next;
                size--;
            }

        }

        public static void main(String[] args) {
            Stack st= new Stack();
            st.push(100);
            st.push(200);
            st.push(300);
            st.push(400);
            st.push(500);
            st.pop();
            st.pop();
            st.push(300);
            st.push(400);
            st.push(500);
            st.pop();
            st.display();
            
            
        }
    }