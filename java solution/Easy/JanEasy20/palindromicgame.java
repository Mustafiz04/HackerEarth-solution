import java.util.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    static int[] characterCount = new int[128];
    
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 128; i++) characterCount[i] = 0;
        
        String s = in.nextLine();
        int len = s.length();
        
        boolean flag = false;
        
        for (int i = 0; i < len; i++) {
            characterCount[s.charAt(i)]++;
            if (characterCount[s.charAt(i)] > 1) {
                flag = true;
                break;
            }
        }
        
        for (int i = 0; i < 128; i++) characterCount[i] = 0;
        
        if (!flag) {
            System.out.println("Tie");
            return;
        }
        
        System.out.println(game(s, len, true));
    }
    
    public static String game(String s, int len, boolean turn) {
        if (check()) {
            return (turn) ? "Bob" : "Alice";
        }
        
        String curTurn = (turn) ? "Alice" : "Bob";
        
        //System.out.println("Front cut || " + s + " || turn: " + curTurn);
        
        char c = s.charAt(0);
        characterCount[(int)c]++;
        s = s.substring(1);
        String result = game(s, len - 1, !turn);
        s = c + s;
        characterCount[(int)c]--;
        
        //System.out.println("Front cut result -> " + result);
        
        if (result.equals(curTurn)) {
            return curTurn;
        }
        
        //System.out.println("Back cut || " + s + " || turn: " + curTurn);
        
        c = s.charAt(len - 1);
        characterCount[(int)c]++;
        s = s.substring(0, len - 1);
        result = game(s, len - 1, !turn);
        s = s + c;
        characterCount[(int)c]--;
        
        //System.out.println("Back cut result -> " + result);
        
        if (result.equals(curTurn)) {
            return curTurn;
        }
        
        return result;
    }
    
    public static boolean check() {
        for (int i = 0; i < 128; i++) {
            if (characterCount[i] > 1) {
                return true;
            }
        }
        
        return false;
    }
}