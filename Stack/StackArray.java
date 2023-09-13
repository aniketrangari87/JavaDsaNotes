public class StackArray {


    public static class Stack{

        private int arr[] = new int[5];
        private int  top =-1;
        private int size=0;

        public void push(int x){
            top++;
            arr[top]=x;
            size++;
            
        }
        int peek(){
            return arr[top];
        }
        int size(){
            return size ;
        }
        void pop(){

           int  top  = arr[size-1 ];
             arr[size-1]=0;
             size--;

        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(100);
        st.push(100);

        st.push(10000);
        st.pop();
         System.out.println(st.peek());
        System.out.println(st.size());

    }
}
