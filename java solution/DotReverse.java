import java.util.*;
import java.lang.*;
import java.io.*;
class CODESTHAAN {
    public static void main(String[] args){
        String a = "iz.taf.s.Mu";
        String[] in = a.split("\\.");
        int l = in.length-1;
        String w = "";
        for(int i = l; i>= 0; i--){
            w += in[i];
        }
        System.out.println(w);     
    }
}
