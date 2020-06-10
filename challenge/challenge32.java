import java.util.*;

class Challenge32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the length of column: ");
        int col = sc.nextInt();

        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                if( (c == 0) || ((c == col-1) && (r != 0 && r != row-1) ) ){
                    System.out.print("* ");
                }else if( (r == 0 || r == row-1) && ( c > 0 && c < col-1) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}