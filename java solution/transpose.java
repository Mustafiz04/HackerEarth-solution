import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                arr[r][c] = scan.nextInt();
            }
        }
        
        for(int c = 0; c<col; c++){
            for(int r = 0; r<row; r++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
 
    }
}