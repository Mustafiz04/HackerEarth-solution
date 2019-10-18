import java.util.*;


class check{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()) ;
    
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            if(isPowerOfTwo(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
    public static boolean isPowerOfTwo(int n) { 
        if(n == 0){
            return false;
        }
            
    
        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
            (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
    } 
    
}
