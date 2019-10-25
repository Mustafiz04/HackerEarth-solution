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
            8

*/


class Test{
    public static void main(String args[]){
        int n = 6;
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

        for(int k = 0; k<= n; k++ ){
            System.out.print("* ");
        }
        System.out.println();

        s = 0;
        for(int i = n; i>0; i--){
            System.out.print(" ");
            for(int j = 0; j<s; j++){
                System.out.print(" ");
            }
            for(int j= 0; j< i; j++){
                System.out.print("* ");
            }
            System.out.println();
            s++;
        }
    }
}