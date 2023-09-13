import java.util.Stack;

class BasicfStack {

  public static void reverseSrec(Stack <Integer> st ){
       if(st.size()==1 )return ;
       int top = st.pop();
       reverseS(st);
       pushA(st, 0, top);

    
  }

  public static Stack <Integer> reverseS(Stack <Integer> st ){
    Stack <Integer> rt= new Stack<>();
    Stack<Integer> gt=new Stack<>();

    while(st.size() >0 ){
      rt.push(st.pop());
    }
    while(rt.size() >0 ){
      gt.push(rt.pop());
    }
    while(gt.size() >0 ){
      st.push(gt.pop());
    }
    
    return st;
  }
   
  public static void pushA(Stack<Integer> st , int p ,int val){
    Stack <Integer> rt= new Stack<>();
    
    while(st.size() > p ){
      rt.push(st.pop());
    }
    st.push(val);
    while(rt.size()> 0 ){
      st.push(rt.pop());
    }
     
  }
  public static void popA(Stack<Integer> st , int p ){
    Stack <Integer> rt= new Stack<>();
    int n = st.size();
    
    while(n > p ){
      rt.push(st.pop());
    }
    st.pop();
    
    while(rt.size()> 0 ){
      st.push(rt.pop());
    }
     
  }

  public static Stack<Integer> copyS(Stack<Integer> s, Stack<Integer> c) {

    int sn = s.size();
    while (sn > 0) {
      c.push(s.pop());
    }
    return c;
  }

  public static void displayReverseRec(Stack<Integer> s) {
    if (s.size() == 0)
      return;
    int top = s.pop();
    System.out.print(top + " ");
    displayReverseRec(s);
    s.push(top);
  }

  public static void display(Stack<Integer> s) {

    if (s.size() == 0)
      return;
    int top = s.pop();

    display(s);
    System.out.print(top + " ");

    s.push(top);
  }

  public static Stack<Integer> printing(Stack<Integer> s) {
    int n = s.size();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = s.pop();
    }
    for (int i = n - 1; i >= 0; i--) {
      s.push(arr[i]);
    }
    return s;
  }

  public static void main(String[] args) {
Stack<Integer> st = new Stack<>();
    
    Stack<Integer> rt = new Stack<>();
    st.push(100);
    st.push(200);
    st.push(300);
    st.push(400);

    System.out.println("Initial " + st);
    System.out.print("After   ");
    reverseSrec(st);
    System.out.println(st);
    

    
    /*
     * Insert At any index
     * 
     * 
     * int index =3;
     * 
     * while(st.size()>index){
     * rt.push(st.pop());
     * 
     * }
     * int x =90;
     * 
     * st.push(x);
     * while(rt.size()>0){
     * st.push(rt.pop());
     * }
     * System.out.println(st);
     */

    /*
     * Copy the Stack in Reverse Order
     * 
     * while(st.size()>0 ){
     * 
     * rt.push(st.pop());
     * 
     * }
     * System.out.println(st+ "\n" +rt);
     */

    /*
     * Copy the Stack in Same Order using 2 two stack
     * 
     * while(st.size() > 0 ){
     * rt.push(st.pop());
     * }
     * System.out.println(rt);
     * Stack <Integer> at = new Stack<>();
     * 
     * 
     * while(rt.size() >0 ){
     * at.push(rt.pop());
     * }
     * System.out.println(at);
     */

  }

}