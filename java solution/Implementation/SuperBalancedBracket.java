import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String bracket = br.readLine();
            System.out.println(count(bracket));
        }
        
    }
    
    public static int count(String b){
        int half = b.length()/2;
        int fho = 0;
        int fhc = 0;
        int sho = 0;
        int shc = 0;
        char[] br = b.toCharArray();
        int total = 0;
        
        for(int i = 0; i< half; i++){
            if(br[i] == '(') {
                fho++;
            }
            if(br[i] == ')' ){
                fhc++;
            }
        }
        for(int i =half; i< b.length(); i++){
            if(br[i] == '(' ){
                sho++;
            }
            if(br[i] == ')' ){
                shc++;
            }
        }
        
        if(fho == shc){
            total = 2*fho;
            return total;
        }
        if(fho < shc){
            total = 2*fho;
            return total;
        }
        return total;
    }

}
