import java.util.*;

public class Challenge{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for(int i=1; i<= rows; i++){
            if(i%2 != 0){
                for(int j=1; j<= rows/2+1; j++){
                    System.out.print("* ");
                }
            }else{
            	for(int j=1; j<= rows/2; j++){
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}