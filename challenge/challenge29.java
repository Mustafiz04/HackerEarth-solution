import java.util.*;

class Challenge29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter the wave height: ");
        int height = sc.nextInt();
        System.out.print("Enter the wave width: ");
        int width = sc.nextInt();
        int wH = height-1;
        int x = wH;

        for(int i = 0; i<= wH; i++){
            for(int j = 0; j<= (width*wH*2); j++ ){
                if( j%(wH*2) == x || j%(wH*2) == wH + i  ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            x--;
            System.out.println();
        }
    }
}