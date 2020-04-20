import java.util.*;

public class Student {
    static String name;
    static int grade;

    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    static int getter(){
        return grade;
    }

    static void printInfo(Student s){
        System.out.println("Name : "+ s.name +" "+ " Grades : " + s.grade);
    }

    static Student readStudent(Scanner sc){
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter student grades: ");
        int grade = sc.nextInt();
        Student student1 = new Student(name, grade);
        return student1;
    }

    static double average(ArrayList arr){
        int total = 0;
        double avg = 0;
        int size = arr.size();
        if( size != 3 ){
            System.out.println("Incomplet");
            return 0;
        }else{
            Iterator<Student> iter = arr.iterator();
            while( iter.hasNext() ){ 
                total += iter.next().getter();
            }
            avg = total/3;
        }
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> std = new ArrayList<Student>();

        // student class
        Student s = new Student(name, grade);

        // adding student
        int n = 3;
        while(n-- > 0){
            Student stud = readStudent(sc);
            std.add(stud);
        }
        // loop through each list and print info
        Iterator<Student> iter = std.iterator();
        while( iter.hasNext() ){
            s.printInfo(iter.next());
        }
        // print all student info
        System.out.println(s.average(std));

        // to empty the ArrayList
        std.clear();
    }
}