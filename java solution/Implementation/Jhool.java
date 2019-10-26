import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        String a,b;
        a = "111111";
        b = "000000";
        
        String c = "";
        Boolean j = true;
        for(int i = 0; i<binary.length()-6; i++){
            c = binary.substring(i,i+6);
            if(c.equals(a) || c.equals(b) ){
                j = false;
                break;
            }
        }
        if(j){
            System.out.println("Good luck!");
        }else{
            System.out.println("Sorry, sorry!");
        }
    }

}
