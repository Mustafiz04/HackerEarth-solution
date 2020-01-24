/*

            * 
          *   *
        *   *   *
      *   *   *   *
    *   *   *   *   *
  *   *   *   *   *   *
*   *   *   *   *   *   *
  *   *   *   *   *   *   
    *   *   *   *   * 
      *   *   *   *
        *   *   *
          *   *
            *

*/

import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n-1;

        for(int i = 0; i< n; i++){
            System.out.print(" ");
            for(int j = 0; j<s; j++){
                System.out.print(" ");
            }
            for(int j= 0; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
            s--;
        }
    }
}