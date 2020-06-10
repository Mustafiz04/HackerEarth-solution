import java.io.*;
import java.util.*;

class Test{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int key = Integer.parseInt(br.readLine());
        String[] msg = br.readLine().split(" ");
        int[] message = new int[size];

        for(int i = 0; i<size; i++){
            message[i] = Integer.parseInt(msg[i]);
        }

        int[] change = new int[size];

        for(int i = 0; i<size; i++){
            if( key > 0 ){
                int sum = message[(i+1)%size] + message[(i+2)%size] + message[(i+3)%size]; 
                change[i] = sum;
            }
            if( key < 0 ){
                int sum = message[size-i-1] + message[size-i-2] + message[size-i-3]; 
                change[i] = sum;
            }
        }
        for(int i = 0; i<size; i++){
           System.out.print(change[i] + " ");
        }
        
    }
}
