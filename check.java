import java.util.*;

class Challenge{ 
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int k = 0, space;
        for (int i = 1; i <= n/2; i++) { 
			for (int j = 1; j <= n - i; j++) { 
				System.out.print(" "); 
			} 
			while (k != (2 * i - 1)) { 
				if (k == 0 || k == 2 * i - 2) 
					System.out.print("*"); 
				else
					System.out.print(" "); 
				k++; 
			} 
			k = 0; 
			System.out.println(); 
		} 
		n--; 
		for (int i = n/2 + 1 ; i >= 1; i--) { 
			for (int j = 0; j <= n - i; j++) { 
				System.out.print(" "); 
            } 
            k = 0;
			while (k != (2 * i - 1)) { 
				if (k == 0 || k == 2 * i - 2) 
					System.out.print("*"); 
				else
					System.out.print(" "); 
				k++; 
			} 
			System.out.println(); 
		} 
	} 
} 
