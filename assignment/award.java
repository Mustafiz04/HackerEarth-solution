import java.util.*;

class Award{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books purchased > ");
        int n = sc.nextInt();
        if(n >= 4){
            n = 4;
        }
        
        int point = 0;  
        switch (n){
            case 0:
                point = 0;
                break;
            case 1:
                point = 5;
                break;
            case 2:
                point = 15;
                break;
            case 3:
                point = 30;
                break;
            case 4:
                point = 60;
                break;
        }
        System.out.println("You have earned " + point +" points");
    }
}