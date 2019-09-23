import java.util.*;
import java.lang.*;
import java.io.*;

class Subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
    
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
    
            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            findSubArray(n, s, m);
        }
    }
    
    private static void findSubArray(int n, int s, int[] m) {
        int first = 0;
        int last = 0;
    
        long result = m[first];
    
        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n) break;
                    result = m[first];
                } else {
                    result -= m[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += m[last];
                } else {
                    break;
                }
            }
        }
    
        if (result != s) {
            System.out.println(-1);
        } else {
            System.out.println((first + 1) + " " + (last + 1));
        }
    }
}
