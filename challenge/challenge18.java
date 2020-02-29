import java.util.*;

class Challenge{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = 1, l = 1;
        for(int i = 0; i< n; i++){
            for(int j = n-1; j> i; j--){
                System.out.print(" ");
            }for(int k = 1; k<=z; k++){
                System.out.print((char)(Math.abs(k-l)+65));
            }
            l++;
            z+=2;
            System.out.println();
        }
    }
}