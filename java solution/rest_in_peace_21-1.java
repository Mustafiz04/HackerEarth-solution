import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            String s=""+n1;
            if(s.contains("21") || (n1%21==0)){
                System.out.println("The streak is broken!");
            }
            else{
                System.out.println("The streak lives still in our heart!");
            }
        }
    }
}