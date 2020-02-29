import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    String word = sc.next();
		    remove(word);
		}
	}
	
	public static void remove(String w){
	    LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	    for(int i = 0; i<w.length(); i++){
	        lhs.add(w.charAt(i) );
	    }
	    for(Character c : lhs){
	        System.out.print(c);
	    }
	    System.out.println();
	}
}