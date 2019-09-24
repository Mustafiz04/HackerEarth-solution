import java.util.*;

class Interchange{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int rows = sc.nextInt();
            int cols = sc.nextInt();
		    int a[][] = new int[rows][cols];
		    
		    for(int i = 0;i<rows;i++){
		        for(int j = 0;j<cols;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    swap(a, rows, cols);
		}
    }


    public static void swap(int[][] arr, int r, int c ){

        int f = 0;
        int l = c-1;
        for(int i = 0; i<r; i++){
            int sw = arr[i][f];
            arr[i][f] = arr[i][l];
            arr[i][l] = sw;
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }


}