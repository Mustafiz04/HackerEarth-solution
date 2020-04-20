import java.util.*;

public class LychrelNumber { 
	private static int MAX_ITERATIONS = 20; 
	private static boolean isLychrel(long number) { 
		for (int i = 0; i < MAX_ITERATIONS; i++) { 
			number = number + reverse(number); 
			if (isPalindrome(number)) 
				return false; 

		} 
		return true; 
	} 

	private static boolean isPalindrome(final long number) { 
		return number == reverse(number); 
	} 

	private static long reverse(long number) { 
		long reverse = 0; 
		while (number > 0) { 
			long remainder = number % 10; 
			reverse = (reverse * 10) + remainder; 
			number = number / 10; 
		} 
		return reverse; 
	} 

	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = sc.nextLong();
		if( isLychrel(number) ){
            System.out.println(number + " is Lychrel Number");
        }else{
            System.out.println(number + " is not Lychrel Number");
        }
	} 
} 
