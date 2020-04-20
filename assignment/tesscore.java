import java.util.*;

public class tesscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        int avg = 0;
        int sum = 0;
        int number;

        int s = 1;
        while( s > 0){
            System.out.print("Item " + s + "> ");
            number = sc.nextInt();
            if( number == -1 ){
                if( total == 0 ){
                    System.out.println("No test grade scores were entered");
                }
                break;
            }
            total++;
            if( number > highest ){
                highest = number;
            }
            if( number < lowest ){
                lowest = number;
            }
            sum += number;
            s++;
        }
        avg = (highest+lowest)/2;
        if(total > 0){
            System.out.println("The number of grades entered: " + total);
            System.out.println("The highest grade: " + highest);
            System.out.println("The lowest grade: " + lowest);
            System.out.println("The average: " + avg);
        }
        
    }
}