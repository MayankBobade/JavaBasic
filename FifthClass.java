public class FifthClass {
    public static void main(String[]args){
      int n = 5;

      // upper half
      for(int i = 1; i <= n; i++){
        // Left part of the pattern
        for(int j = 1; j <= i; j++){
           System.out.print("*");
        }
        
        // Spaces in the middle
        int spaces = 2 * (n - i);
        for(int k = 1; k <= spaces; k++){
           System.out.print(" ");
        }
        
        // Right part of the pattern
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
      }

      // lower half
      for(int i = n; i >= 1; i--){
        // Left part of the pattern
        for(int j = 1; j <= i; j++){
           System.out.print("*");
        }
        
        // Spaces in the middle
        int spaces = 2 * (n - i);
        for(int k = 1; k <= spaces; k++){
           System.out.print(" ");
        }
        
        // Right part of the pattern
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
}
// print the pattern of hollow rectangle
// ******
// *    *
// *    *
// ******
// we can notice that the * is only printed if i==0 or j==0 or i==n or j==n+1;
// we can solve this using two nested loops and if conditions

// floyd's triangle //very easy to print using counter
// 1
// 23
// 456
// 78910

// print the pattern
// 1
// 01
// 101
// 0101
// 10101
// if sum 0f i index and j index is odd print 0,if even print 1


// butterfly pattern,refer and run the above code
// *    *
// **  **
// ******
// ****** 
// **  **
// *    *   spaces=2*n-i; just refer the code for proper clarityin upper half the loop will run from 0->n and in lower half the loop will run from  n->0

// rhombus
//      *****
//     *****
//    *****
//   *****
//  *****
// *****