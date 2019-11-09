// @author CODESTHAAN
//Comment the output!
class Codesthaan { 
	public static void main(String args[]) { 
		String alpha[] = { "a", "b", "c", "a", "c" }; 
		for (int i = 0; i < alpha.length; i++) 
			for (int j = i + 1; j < alpha.length; j++) 
				if (alpha[i].compareTo(alpha[j]) == 0) 
					System.out.print(alpha[j]); 
	} 
} 
