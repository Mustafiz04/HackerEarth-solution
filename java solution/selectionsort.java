import java.util.Scanner;
class selection
{
    static void sort(int arr[], int a, int counter)
    {
        int min,i,j,temp;
        for(i=0;i<a-1;i++)
        {
            min = i ;
            for(j=i+1;j<a;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min] ;
            arr[min] = temp;
            counter--;
            if(counter==0)
            {
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int arr[] = new int[a];
        int i;
        for(i=0;i<a;i++)
        {
            arr[i] = obj.nextInt();
        }
        sort(arr,a,b);
        for(i=0;i<a;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}