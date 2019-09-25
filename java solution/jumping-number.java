import java.util.*;


class Jumping{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int num = sc.nextInt();
            jumpingNumber(num);
        }
    }


    public static boolean check(int num){
        int l = num%10;
        int rem = num/10;
        boolean jump = true;
        do{
            int a = rem%10;
            int diff = a - l;
            if( Math.abs(diff) == 1){
                check(rem);
            }else{
                jump = false;
                break;
            }
        }while( rem/10 != 0);
        return jump;
    }

    public static void jumpingNumber(int n){
        if(n <= 10){
            for(int i = 0; i <= n; i++){
                System.out.print(i + " ");
            }
        }else{
            for(int j = 11; j <= n ; j++){
                boolean c = check(j);
                if(c){
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println();
    }
}













// import java.util.*; 


// class GFG { 
    // public static void main(String[] args) throws IOException 
	// { 
	// 	Scanner sc = new Scanner(System.in);
    //     int T = sc.nextInt();
    //     while(T-- > 0){
    //         System.out.print("0 "); 
    //         int x = sc.nextInt();
    //     	GFG obj = new GFG();
    //         obj.printJumping(x) ;
    //     }

	// }
 
// 	public void bfs(int x, int num) 
// 	{ 
// 		Queue<Integer> q = new LinkedList<Integer>(); 
// 		q.add(num); 

// 		while (!q.isEmpty()) { 
// 			num = q.peek(); 
// 			q.poll(); 
// 			if (num <= x) { 
// 				System.out.print(num + " "); 
// 				int last_digit = num % 10; 

// 				// If last digit is 0, append next digit only 
// 				if (last_digit == 0) { 
// 					q.add((num * 10) + (last_digit + 1)); 
// 				} 

// 				// If last digit is 9, append previous digit only 
// 				else if (last_digit == 9) { 
// 					q.add((num * 10) + (last_digit - 1)); 
// 				} 

// 				// If last digit is neighter 0 nor 9, append both 
// 				// previous and next digits 
// 				else { 
// 					q.add((num * 10) + (last_digit - 1)); 
// 					q.add((num * 10) + (last_digit + 1)); 
// 				} 
// 			} 
// 		} 
// 	} 



// } 

