import java.util.*;

public class StackQuestions {



    public static int[] removeC(int arr[]){
        int n=arr.length;
        Stack <Integer> st = new Stack<>();
        int ans[]= new int[n];

        for( int i =0 ; i< n ; i++){
            if(st.size() == 0 || st.peek() != arr[i]){
              st.push(arr[i])
            }
        }

        return ans;
    
    }


            public static void main(String[] args) {
                
                int arr[] ={1,2,2,3,10,10,10,4,4,4,7,2};
                int res[]=removeC(arr);
                for (int x : res) {
                    System.out.print(x);
                    
                }
            }


}
