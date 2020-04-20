package assignment;

import java.util.*;

public class playdice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.print("How many times should I roll my dice?> ");
        int num = sc.nextInt();

        int ones = 0; 
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int sumos = 0;
        int dice1, dice2;
        int min = 1;
        int max = 6;
        for(int i = 0; i<num; i++){
            dice1 = min + (int)(Math.random() * max);
            dice2 = min + (int)(Math.random() * max);

            if(dice1 == 1 && dice2 == 1){
                ones++;
            }else if(dice1 == 2 && dice2 == 2){
                two++;
            }else if(dice1 == 3 && dice2 == 3){
                three++;
            }else if(dice1 == 4 && dice2 == 4){
                four++;
            }else if(dice1 == 5 && dice2 == 5){
                five++;
            }else if(dice1 == 6 && dice2 == 6){
                six++;
            }else if( (dice1 == 1 && dice2 == 6) || (dice1 == 6 && dice2 == 1) ){
                sumos++;
            }
        }

        System.out.println("You rolled a pair of ones "+ ones +" (snake eyes) times out of "+ num);
        System.out.println("You rolled a pair of twos "+ two +" times out of "+ num);
        System.out.println("You rolled a pair of threes "+ three +" times out of "+ num);
        System.out.println("You rolled a pair of fours "+ four +" times out of "+ num);
        System.out.println("You rolled a pair of fives "+ five +" times out of "+ num);
        System.out.println("You rolled a pair of sixes "+ six +" times out of "+ num);
        System.out.println("You rolled a 1 and a 6 - "+ sumos +" times out of "+ num);
        
    }
}