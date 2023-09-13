import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        int arr[] = { 10, 2, 44, 44, 44, 2, 21, 1, 22, 2, 2, 22, 9 };

        Map <Integer ,Integer> m = new HashMap<>();

        for( int x : arr){

            if(m.containsKey(x) == false){
                m.put(x, 1);
            }else{
                    m.put(x, m.get(x)+1);
            }

        }
        System.out.println(m);


    }
}