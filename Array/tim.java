import java.util.Arrays;

public class tim {
    


    public  static String kthLargestNumber(String[] nums, int k) {
        String string[] = new String[nums.length];
          for(int i = 0 ; i< nums.length ; i++){
            string[i]=nums[i];
          }
          Arrays.sort(string);


    
        return string[nums.length-k] ; 
     }

    public static void main(String[] args) {
        

        String ans[]={"2","21","12","1"};
        int k = 2;
       
    System.out.println(true);
      
          
        
    }
    
}
