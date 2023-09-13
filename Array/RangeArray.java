import java.util.Scanner;




class RangeArray {


   static int[] makePrefixSum(int arr[]){
        int n = arr.length;
        int[] Prefix = new int[n];
        Prefix[0]=arr[0];

        for(int i = 1; i < n ; i++){
            Prefix[i]=Prefix[i-1]+arr[i];
        }

        return Prefix;
    }

   

      static void printArray(int arr[]) {
        System.out.print("Array is : ");
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements  : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            
        }
        
        
       

         int pref[] = makePrefixSum(arr);

        System.out.println("Enter the no Quries ");
        int q = sc.nextInt();

        while(q-- > 0 ){
            System.out.println("Enter the l and r  :");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans= pref[r]-pref[l-1];

            System.out.println("Sum : "+ ans);
            

        }
    }
        
    
    
}
