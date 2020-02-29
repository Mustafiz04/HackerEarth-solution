import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i = 0; i<s.length(); i++ ){
            if( !hm.containsKey(s.charAt(i)) ){
                hm.put(s.charAt(i),0);
            }
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1 );
            lhs.add(s.charAt(i));
        }
        int same = 0,count=0, other = 0;
        int occur = hm.get( s.charAt(0) );
        for( Character c : lhs ){
            if( hm.get(c) != occur ){
                count++;
            }
            other = hm.get(c);
        }
        if( count > 1 || (other-1 == occur) ){
            return "NO";
        }else{
            return "YES" ;          
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
