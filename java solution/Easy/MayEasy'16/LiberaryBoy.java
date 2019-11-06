import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[26];
        int i;
        while(n-- > 0){
            String str = br.readLine();
            i = (str.charAt(0)-97);
            arr[i] += 1;
        }
        int sum = 0;
        int temp;
        for(int j = 0; j<26; j++){
            if(arr[j] > 0){
                temp = arr[j]%10;
                sum += arr[j]/10;
                if(temp>0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
