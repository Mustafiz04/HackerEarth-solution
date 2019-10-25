import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int opp=0;
        String side =  " ";
        while(T-- > 0){
            int seatNo = sc.nextInt();
            int a = seatNo%12;
            switch(a){
                case 1:
                    opp = seatNo +  11;
                    side = "WS";
                    break;
                case 2:
                    opp = seatNo +  9;
                    side = "MS";
                    break;
                case 3:
                    opp = seatNo +  7;
                    side = "AS";
                    break;
                case 4:
                    opp = seatNo +  5;
                    side = "AS";
                    break;
                case 5:
                    opp = seatNo +  3;
                    side = "MS";
                    break;
                case 6:
                    opp = seatNo +  1;
                    side = "WS";
                    break;
                case 7:
                    opp = seatNo -  1;
                    side = "WS";
                    break;
                case 8:
                    opp = seatNo -  3;
                    side = "MS";
                    break;
                case 9:
                    opp = seatNo -  5;
                    side = "AS";
                    break;
                case 10:
                    opp = seatNo -  7;
                    side = "AS";
                    break;
                case 11:
                    opp = seatNo -  9;
                    side = "MS";
                    break;
                case 0:
                    opp = seatNo -  11;
                    side = "WS";
                    break;
            }
            System.out.println(opp + " " + side );
        }
    }
    
    
    
}
