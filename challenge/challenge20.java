//JAVA CODE
import java.util.*;

class Challenge{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = 1;
        int num;
        int evenmul = 0, evensum = 1;
        int oddmul = 1, oddsum = 2;
        for(int i =0 ; i<n; i++){
            for(int j = n-1; j>i; j--){
                System.out.print(" ");
            }
            if( i%2 == 0 ){
                num = i*evenmul+evensum;
                evenmul++;
                evensum++;
            }else{
                num = i*oddmul+oddsum;
                oddmul++;
                oddsum+=2;
            }
            for(int k = 1; k<=z; k++){
                if( i%2 == 0 ){
                    if( k%2 != 0 ){
                        System.out.print(num);
                        num++;
                    }else{
                        System.out.print("*");
                    }
                }else{
                    if( k%2 != 0 ){
                        System.out.print(num);
                        num--;
                    }else{
                        System.out.print("*");
                    }
                }
            }
            z+=2;
            System.out.println();
        }
    }
}