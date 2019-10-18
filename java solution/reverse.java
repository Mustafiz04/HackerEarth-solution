<<<<<<< HEAD

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            reverse(arr, n);
        }
    }
	
	// public static void reverse(int[] arr, int n){
	//     for(int i = 0; i<n/2; i++){
    //         int temp = arr[i];
    //         arr[i] = arr[n-1-i];
    //         arr[n-1-i] = temp;
	//     }
	//     for(int j = 0; j<n; j++){
	//         System.out.print(arr[j] + " ");
	//     }
	//     System.out.println(" ");
    // }
    public static void reverse(int[] arr, int n){
        int left = 0;
        int right = n-1;
	    while(left< right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
	    }
	    for(int j = 0; j<n; j++){
	        System.out.print(arr[j] + " ");
	    }
	    System.out.println(" ");
	}
=======

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            reverse(arr, n);
        }
    }
	
	// public static void reverse(int[] arr, int n){
	//     for(int i = 0; i<n/2; i++){
    //         int temp = arr[i];
    //         arr[i] = arr[n-1-i];
    //         arr[n-1-i] = temp;
	//     }
	//     for(int j = 0; j<n; j++){
	//         System.out.print(arr[j] + " ");
	//     }
	//     System.out.println(" ");
    // }
    public static void reverse(int[] arr, int n){
        int left = 0;
        int right = n-1;
	    while(left< right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
	    }
	    for(int j = 0; j<n; j++){
	        System.out.print(arr[j] + " ");
	    }
	    System.out.println(" ");
	}
>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
}