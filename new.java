// // Java program to find length of the shortest chain 
// // transformation from source to target 
// import java.util.*; 

// class GFG { 


// static int shortestChainLen(String start, String target, List<String> wordsList) { 
//     start = start.toLowerCase();
//     target = target.toLowerCase();
//     Set<String> D = new HashSet<String>(); 
//         for (String x : wordsList) 
//             D.add(x.toLowerCase()); 

// 	if (!D.contains(target)) 
// 		return 0; 
 
//     int level = 0, wordlength = start.length(); 
    
// 	Queue<String> Q = new LinkedList<>(); 
// 	Q.add(start); 

// 	while (!Q.isEmpty()) {  
// 		++level;  
// 		int sizeofQ = Q.size(); 

// 		for (int i = 0; i < sizeofQ; ++i) { 
// 			char []word = Q.peek().toCharArray(); 
// 			Q.remove(); 
// 			for (int pos = 0; pos < wordlength; ++pos) { 
// 				char orig_char = word[pos]; 
// 				for (char c = 'a'; c <= 'z'; ++c) { 
// 					word[pos] = c; 
// 					if (String.valueOf(word).equals(target)) 
// 						return level + 1;  
// 					if (!D.contains(String.valueOf(word))) 
// 						continue; 
// 					D.remove(String.valueOf(word));  
// 					Q.add(String.valueOf(word)); 
// 				} 
// 				word[pos] = orig_char; 
// 			} 
// 		} 
// 	} 

// 	return 0; 
// } 

// // Driver code 
// public static void main(String[] args) 
// { 
// 	// make dictionary 
// 	List<String> D = new ArrayList<String>(); 
// 	D.add("HOT"); 
// 	D.add("DOT"); 
// 	D.add("DOG"); 
// 	// D.add("poie"); 
// 	// D.add("plie"); 
// 	// D.add("poin"); 
// 	// D.add("plea"); 
// 	String start = "HOT"; 
// 	String target = "DOG"; 
// 	System.out.print("Length of shortest chain is: "
// 		+ shortestChainLen(start, target, D)); 
// } 
// } 

// // This code is contributed by PrinciRaj1992 



import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int c = 1; c<=t; c++){
            int n = sc.nextInt();
            char[] in = sc.next().toCharArray();
            int l = (n+1)/2;
            int max = 0;
            for(int i = 0; i<n-l; i++){
                int sum = 0;
                for(int j = i; j<i+l; j++){
                    sum += Character.getNumericValue(in[j]);;
                }
                if( sum > max ){
                    max = sum;
                }
            }
            System.out.println("Case #"+ c + ": " + max);
        }
    }
}