import java.util.*;

class Strongnumber{
    static int f[] = new int[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        preCompute();
        if(isStrong(num)){
            System.out.println(num + " is a strong number.");
        }else{
            System.out.println(num + " is not a strong number.");
        }
    }
    static boolean isStrong(int x) { 
        int factSum = 0; 
        int temp = x; 
        while (temp>0) { 
            factSum += f[temp%10]; 
            temp /= 10; 
        } 
        return (factSum == x); 
    } 
    static void preCompute() { 
        f[0] = f[1] = 1; 
        for (int i = 2; i<10; ++i) 
            f[i] = f[i-1] * i; 
    }
}