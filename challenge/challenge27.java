package challenge;

import java.util.*;
public class challenge27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<i-1; j++){
                System.out.print( " ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=1; i--){
            for(int j = i-1; j>0; j--){
                System.out.print( " ");
            }
            for(int k = i; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}