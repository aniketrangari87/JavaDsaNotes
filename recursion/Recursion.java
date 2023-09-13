
class Recursion {

   // Searching in the array using recursion

   public static boolean search(int arr[], int n, int target, int i) {

      // base case
      if (i == arr.length) {
         return false;
      }

      // self work
      if (arr[i] == target) {
         return true;
      }

      // recursive work
      return search(arr, n, target, i + 1);
   }

   // printing the sum of the elements in the array
   public static int sumArr(int arr[], int i) {

      if (i == arr.length) {
         return 0;
      }

      int sum = sumArr(arr, i + 1);

      // self work
      return sum + arr[i];

   }
   // Printing the max value in the array

   public static int maxInArray(int arr[], int i) {

      if (i == arr.length - 1) {
         return arr[i];

      }
      int small = maxInArray(arr, i + 1); // Recursion work

      return Math.max(arr[i], small);
   }
   // Printing The array

   public static void printArr(int arr[], int i) {

      // base case
      if (i == arr.length) {
         return;
      }

      System.out.println(arr[i]); // Self word
      printArr(arr, i + 1); // Recursive Work

   }

   // greatest common divisor of two numbers using divide method
   public static int gcdD(int x, int y) {
      if (y == 0) {
         return x;
      } else {
         return gcdD(y, x % y);
      }
   }

   public static int gcdr(int a, int b) {

      while (a % b != 0) {
         int rem = a % b;
         a = b;
         b = rem;
      }
      return b;
   }
   // Greatest common divisor of two numbers : time comp { o ( n2) }

   public static int gcd(int a, int b) {

      int max = Integer.MIN_VALUE;
      for (int i = 1; i < a; i++) {
         for (int j = 1; j < b; j++) {
            if (a % i == 0 && b % j == 0 && i == j) {
               if (i > max) {
                  max = i;
               }
            }
         }
      }
      return max;
   }

   // OddEven sum of the given n numbes
   public static int oddEvenSum(int n) {
      if (n == 0)
         return 0;
      if (n % 2 == 0) {
         return oddEvenSum(n - 1) - n;
      } else {
         return oddEvenSum(n - 1) + n;
      }
   }

   // Calculating the k mltiple of a given number
   public static void calMulti(int n, int k) {

      if (k == 0) {

         System.out.print(n);
         return;

      } else if (k == 1) {
         System.out.print(n + " ");
         return;
      } else {
         calMulti(n, k - 1);
         System.out.print(n * k + " ");

      }

   }

   // factorial of a given nunmber
   public static int factorial(int n) {

      if (n == 0 || n == 1) {

         return 1;

      }
      return n * factorial(n - 1);
   }

   // Fibonacci series
   public static int fibo(int n) {
      if (n == 0 || n == 1) {
         return n;
      }

      return fibo(n - 1) + fibo(n - 2);8
   }

   // Print the numbers in the increasing order
   public static void printIncreasing(int n) {

      if (n == 1) {
         System.out.println(n);
         return;
      }
      printIncreasing(n - 1);
      System.out.println(n);

   }

   // Sum of the n numbers using recursuon
   public static int sum(int n) {
      int currSum = 0;
      if (n < 1) {
         return 0;
      } else {
         currSum = n + sum(n - 1);
      }
      return currSum;
   }

   public static void main(String[] args) {

      int arr[] = { 100, 20, 200 };
      System.out.println(search(arr, 3, 2000, 0));

   }
}