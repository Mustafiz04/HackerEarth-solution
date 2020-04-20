import java.util.*;

class AdvancePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("    ");
            }
            for(int k = 0; k<i; k++){
                int num = (int)Math.pow(2,k);
                System.out.printf("%4d", num );
            }
            System.out.println();
        }
        
    }
}