import java.util.*;

class Ugly{
    public static void main(String args[]){
        boolean x = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int num = number;
        while (num != 1) {  
            if (num % 5 == 0) { // To check if number is divisible by 5 or not
                num /= 5;  
            } 
            else if (num % 3 == 0) { // To check if number is divisible by 3 or not 
                num /= 3;  
            } 
            else if (num % 2 == 0) { // To check if number is divisible by 2 or not
                num /= 2;  
            } 
            else {  
                System.out.print(number + " is not an ugly number."); 
                x = true;  
                break;  
            }  
        } 
        if ( !x ){ 
            System.out.print(number + " is an ugly number.");
        }
    }
}

