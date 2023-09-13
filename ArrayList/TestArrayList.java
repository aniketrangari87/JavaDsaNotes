import java.util.ArrayList;
import java.util.Collections;

class TestArrayList{


    public static void  reverseArrayList(ArrayList<Integer> List){

        int i = 0 , j = List.size()-1;

        while(i<j){
            int temp=Integer.valueOf(List.get(i));
            List.set(i, List.get(j));
            List.set(j, temp);
            i++;
            j--;
        }



    }


    public static void main(String[] args) {

        ArrayList<Integer> L1 = new ArrayList<>();

        L1.add(100);
        L1.add(200);
        L1.add(300);
        L1.add(400);
        L1.add(500);
        System.out.println(L1);
        // reverseArrayList(L1);
        Collections.reverse(L1);
        Collections.sort(L1,Collections.reverseOrder());
        System.out.println(Collections.min( L1));
        System.out.println(L1);

      
        
    }
}