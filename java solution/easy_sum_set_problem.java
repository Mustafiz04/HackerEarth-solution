
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int max=0,sum =0 , flag =0;
        int n =s.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n ; i++)
            arr[i] = s.nextInt();
        Arrays.sort(arr);

        int m = s.nextInt();
        int[] arr1 = new int[m];
        for(int i =0; i<m ;i++)
            arr1[i] = s.nextInt();
        Arrays.sort(arr1);

        max = arr1[m-1];

        x : for(int i =1; i<100;i++)
        {
            y : for(int j = 0; j<n ; j++)
            {   
                flag =0;
                sum = arr[j]+i;
                if(sum > max)
                    break x;
                for(int k = 0; k<m ; k++)
                {
                    if(sum == arr1[k])
                    {
                        flag =1;
                        break;
                    }
                }
                if(flag==0)
                    break y;
            }
            if(flag == 1)
            System.out.print(i+" ");
        }
        
    }
}