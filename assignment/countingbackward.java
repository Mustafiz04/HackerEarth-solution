import java.util.*;

class countingbackward{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting number> ");
        int start = sc.nextInt();
        System.out.print("Ending number> ");
        int end = sc.nextInt();

        if( start <=  end){
            System.out.println("Invalid input");
        }else{
            int number = start - end + 1;
            System.out.println("There are "+ number + " numbers between " +start + " and " + end );
            while( start >= end ){
                if( start % 10 == 0 ){
                    System.out.println(start + " *");
                }else{
                    System.out.println(start);
                }
                start--;
            }
            System.out.println("Done");
        }
    }
}