import java.util.*;

class Fascinating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 digit number: ");
        int num = sc.nextInt();
        if( isFascinating(num) ){
            System.out.println(num + " is a fascinating number.");
        }else{
            System.out.println(num + " is not a fascinating number.");
        }
    }

    public static boolean isFascinating(int n) {
        String strNum = ""+ n + (n*2) + (n*3);
        int freq[] = new int[11];

        for(int i = 0; i< strNum.length(); i++){
            int digit = strNum.charAt(i) - '0';
            freq[digit]++;
        }
        for(int i = 1; i<=9; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}