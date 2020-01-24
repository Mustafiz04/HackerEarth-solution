import java.util.*;

public class Challenge{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows; j++){
                if (j % 2 == 0)
                    System.out.print((rows * (j)) + i + 1 + " ");
                else
                    System.out.print((rows * (j + 1)) - i + " ");
            }
            System.out.println();
        }
    }
}