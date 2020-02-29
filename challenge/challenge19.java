import java.util.*;

class Challenge{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int px = 1, py = n*2-1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n*2; j++){
                if( j== px || j == py ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            px++;
            py--;
            System.out.println();
        }
    }
}
