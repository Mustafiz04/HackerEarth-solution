import java.util.*;

public class Solution{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        Set<Integer>ob = new HashSet();
        int t;
        t = sc.nextInt();
        int count = 0;
        while(t != 0){
            int n = sc.nextInt();
            while(n != 0){
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                if( !ob.contains(x) ){
                    count++;
                    ob.add(x);
                }
                if( !ob.contains(y) ){
                    count++;
                    ob.add(y);
                }
                n--;
            }
            System.out.println(count);
            ob.clear();
            t--;
            count=0;
        }
    }
}