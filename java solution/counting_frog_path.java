import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
 
        int count = 0;
 
        for(int i = x; i<= x+s; i++){
            for(int j = y; j<= y+s; j++){
                if( (i + j) <= t ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}