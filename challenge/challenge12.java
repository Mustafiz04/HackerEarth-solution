import java.util.*;

class Challenge{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range number :- ");
        int start = sc.nextInt();
        System.out.print("Enter the ending range number :- ");
        int end = sc.nextInt();
        int count = 0;
        for(int i = start; i<=end; i++){
            String s = i+"";
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j) == '1'){
                    count++;
                }
            }
        }
        System.out.println("Number if 1's = " + count);
    }
}