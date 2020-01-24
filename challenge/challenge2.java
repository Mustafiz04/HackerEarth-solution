//  1    2   3    4   5
//  11   12  13   14  15
//  21   22  23   24  25
//  16   17  18   19  20
//  6    7    8   9   10

import java.util.*;
class Challenge{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        for(int i = 1; i<=n; i++){
            for(int j = start; j< start+n; j++){
                System.out.print(j + " ");
            }
            System.out.println();

            if( i == (n+1)/2 ){
                if( n%2 != 0 ){
                    start = n*(n-2) +1;
                }else{
                    start = n*(n-1) +1;
                }
            }else if( i > (n+1)/2 ){
                start = start - 2*n;
            }else{
                start = start + 2*n;
            }
        }  
    }
}