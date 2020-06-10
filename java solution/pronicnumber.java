import java.util.*;

class pronicnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int n;
        boolean flag = false;

        for(n = 0; n<=num; n++){
            if( n*(n+1) == num ){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(num + " is a pronic number as it is product of "+ n +" and " + (n+1));
        }else{
            System.out.println(num + " is a not pronic number.");
        }
    }
}