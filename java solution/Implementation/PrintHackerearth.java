import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] ch = br.readLine().toCharArray();
        
        int[] count = new int[7];
        for(int i = 0; i<n; i++){
            if(ch[i] == 'h'){
                count[0]++;
            }else if(ch[i] == 'a'){
                count[1]++;
            }else if(ch[i] == 'c'){
                count[2]++;
            }else if(ch[i] == 'k'){
                count[3]++;
            }else if(ch[i] == 'e'){
                count[4]++;
            }else if(ch[i] == 'r'){
                count[5]++;
            }else if(ch[i] == 't'){
                count[6]++;
            }
        }
        
        count[0] = count[0]/2;
        count[1] = count[1]/2;
        count[4] = count[4]/2;
        count[5] = count[5]/2;
        
        int min = 100000;
        for(int i = 0 ;i < 7; i++){
            if(min > count[i]){
                min = count[i];
            }
        }
        System.out.println(min);
    }
}
