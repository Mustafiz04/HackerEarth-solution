import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int q=Integer.parseInt(s[1]);
        
        String s1[]=br.readLine().split(" ");
        int arr[]=new int[n];
        arr[0]=Integer.parseInt(s1[0]);
        
        
        for(int i=1;i<n;i++)
        {
            arr[i]=gcd(arr[i-1],Integer.parseInt(s1[i]));
            //System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<q;i++)
        {
            int val=Integer.parseInt(br.readLine());
            int f=0;
            int j=0;
            while(j<n && val%arr[j]!=0 && val>=arr[j])
                {
                    j++;
                }
            
            if(j<n && val%arr[j]==0)
                f=1;
            if(f==1)
            {
                System.out.println("YES");
            }
            else
            System.out.println("NO");
            
        }
        
        
    }
    static int gcd(int a, int b) 
    { 
        // GCD(0, b) == b; GCD(a, 0) == a,  
        // GCD(0, 0) == 0 
        if (a == 0) 
            return b; 
        if (b == 0) 
            return a; 
  
        // Finding K, where K is the greatest  
        // power of 2 that divides both a and b 
        int k; 
        for (k = 0; ((a | b) & 1) == 0; ++k)  
        { 
            a >>= 1; 
            b >>= 1; 
        } 
  
        // Dividing a by 2 until a becomes odd  
        while ((a & 1) == 0) 
            a >>= 1; 
  
        // From here on, 'a' is always odd. 
        do { 
            // If b is even, remove  
            // all factor of 2 in b 
            while ((b & 1) == 0) 
                b >>= 1; 
  
            // Now a and b are both odd. Swap  
            // if necessary so a <= b, then set  
            // b = b - a (which is even) 
            if (a > b)  
            { 
  
                // Swap u and v. 
                int temp = a; 
                a = b; 
                b = temp; 
            } 
  
            b = (b - a); 
        } while (b != 0); 
  
        // restore common factors of 2  
        return a << k; 
    } 
    
    
    
}