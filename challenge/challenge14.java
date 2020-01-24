import java.util.*;

public class Challenge{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= rows; k++){
                if( i == 1 || i == rows || k == 1 || k == rows  )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}