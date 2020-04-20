import java.util.*;

class Codesthaan{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        int np = 1;
        char cp = 'A';
        for(int i = 0; i<n; i++){
            for(int j = n-1; j>i; j--){
                System.out.print("  ");
            }
            for(int k = 0; k<m; k++){
                if(i%2 == 0 ){
                    System.out.print(np+" ");
                    np++;
                }else{
                    System.out.print(cp+" ");
                    cp++;
                }
                np = (np > 9)?1:np;
                cp = (cp > 'Z')?'A':cp;
            }
            m += 2;
            System.out.println();
        }
    }
}