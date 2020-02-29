import java.io.*;

public class Challenge{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try{ n = Integer.parseInt(br.readLine()); }
        catch(Exception e){
            System.out.println("an error occured.please enter a numeral between 3 and 15"); 
            System.exit(0);
        }
        if(n>2 && n<16){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-1;j++)
                System.out.print((j==1 || i==n)?"*":" ");
                for(int k=1;k<=n;k++)
                System.out.print((k==1 || i==n || i==1)?"*":" ");
                System.out.println();
            }
            n-=1;
            for(int l=1;l<=n;l++){
                for(int m=1;m<=n;m++)
                    System.out.print((l==n)?"*":" ");
            
                for(int p=1;p<=n+1;p++)
                    System.out.print((p==1 || p==(n+1))?"*":" ");
                    System.out.println();
            }
        }else
            System.out.println("please enter a numeral between 3 and 15");
    }
}