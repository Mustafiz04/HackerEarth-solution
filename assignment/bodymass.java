import java.util.*;

class Bodymass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the planet name> ");
        String name = sc.next();
        System.out.print("Enter your body mass (in pounds)> ");
        int mass = sc.nextInt();

        name = name.toLowerCase();
        double weight = 0;
        double sp = 0;
        boolean y = false;
        if( name.equals("mercury") ){
            sp = 0.055;
            weight = mass*sp;
            y = true;
        }else if( name.equals("venus") ){
            sp = 0.82;
            weight = mass*sp;
            y = true;
        }else if( name.equals("earth") ){
            sp = 1.0;
            weight = mass*sp;
            y = true;
        }else if( name.equals("mars") ){
            sp = 0.11;
            weight = mass*sp;
            y = true;
        }else if( name.equals("jupiter") ){
            sp = 318;
            weight = mass*sp;
            y = true;
        }else if( name.equals("saturn") ){
            sp = 95.2;
            weight = mass*sp;
            y = true;
        }

        if(y){
            System.out.println("Based on your body mass " + mass + ", on planet "+ name+", you would weight "+weight +" pound" );
        }else{
            System.out.println("You have entered an invalid planet name");
        }

    }
}