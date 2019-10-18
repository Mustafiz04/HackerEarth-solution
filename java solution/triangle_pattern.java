/*

*
 *
* *
 * *
* * *
 * * *
* * * *

*/



class Test{
    public static void main(String args[]){
        int n = 6;
        

        for(int i = 0; i<= n; i++){
            int s = 1;
            for(int j =0; j<i+1; j+=2){
                while(s > 0){
                    if(i%2 != 0){
                        System.out.print(" ");
                        j++;
                    }
                    s--;
                }
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}