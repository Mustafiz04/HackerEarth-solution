package assignment;

import java.util.*;
import java.io.*;

public class fileanalysis {
    public static void main(String[] args) throws IOException  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name> ");
        String filename = sc.next();

        File f1 = new File(filename+".txt"); 
        int linecount = 0; 
        int period = 0;
        int countWord = 0;
        int whitespaceCount = 0;
        int parentheses = 0;
        int vowel = 0;
        FileReader fr = new FileReader(f1); 
        BufferedReader br = new BufferedReader(fr);
        String s;              
        while((s=br.readLine())!=null) {
            String[] sentenceList = s.toLowerCase().split("\\s+");
            for( int i = 0; i < sentenceList.length; i++ ){
                if( sentenceList[i].matches(".*[.]") ){
                    period++;
                }
                for(int j = 0; j < sentenceList[i].length(); j++){
                    if( sentenceList[i].charAt(j) == 'a' ){
                        vowel++;
                    }
                    if( sentenceList[i].charAt(j) == 'e' ){
                        vowel++;
                    }
                    if( sentenceList[i].charAt(j) == 'i' ){
                        vowel++;
                    }
                    if( sentenceList[i].charAt(j) == 'o' ){
                        vowel++;
                    }
                    if( sentenceList[i].charAt(j) == 'u' ){
                        vowel++;
                    }
                    if( sentenceList[i].charAt(j) == '(' ){
                        parentheses++;
                    }
                    if( sentenceList[i].charAt(j) == ')' ){
                        parentheses++;
                    }
                }
            }
            
            String[] wordList = s.split("\\s+"); 
            countWord += wordList.length; 
            whitespaceCount += countWord -1; 

            linecount++;  
                
        }
        fr.close();
        System.out.println("File Analytics");
        System.out.println("Number of Lines: " + linecount);
        System.out.println("Number of Spaces: " + whitespaceCount);
        System.out.println("Number of Periods: " + period);
        System.out.println("Number of Parantheses: " + parentheses);
        System.out.println("Number of Vowels: " + vowel);
    }
}