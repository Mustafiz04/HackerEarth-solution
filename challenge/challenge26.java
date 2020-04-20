package challenge;

import java.util.*;

class Challenge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstnum = 0;
        int secondnum = 1;
        int result = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j<=i; j++){
                firstnum = secondnum;
                secondnum = result;
                System.out.print(result+" ");
                result = firstnum + secondnum;
            }
            firstnum = 0;
            secondnum = 1;
            result = 0;
            System.out.println();
        }
    }
}