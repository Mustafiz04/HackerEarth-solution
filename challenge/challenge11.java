import java.util.*;

public class Challenge{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for(int i=1; i<= rows; i++){
            for(int j=1; j<=rows; j++){
                if(j==i || j==rows-i+1){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}