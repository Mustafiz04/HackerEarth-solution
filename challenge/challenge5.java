import java.util.*;

public class Challenge{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j < i; j++){
                System.out.print("0 ");
            }
            System.out.print(i + " ");
            for (int k = i; k < rows; k++){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}