import java.util.*;

public class challenge31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row length: ");
        int row = sc.nextInt();
        System.out.print("Enter the column length: ");
        int col = sc.nextInt();

        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                if( c == 0 || ( ((r == 0) || (r == row-1) ) && c > 0  )){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}  