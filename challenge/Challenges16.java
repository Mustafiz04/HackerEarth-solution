import java.util.*;

class Codesthaan { 
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n =  sc.nextInt();
		for (int i = 0; i < n; i++) { 
            for (int j = 0; j <= n / 2; j++) { 
                if ((j == 0 || j == n / 2) && i != 0 || 
					// print first line of alphabet 
					i == 0 && j != 0 && j != n / 2 || 
					// prints middle line 
					i == n / 2) 

					System.out.print("*"); 
				else
					System.out.print(" "); 
			} 
			System.out.println(); 
		} 
	} 
} 
