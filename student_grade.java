// student detailes with grade
import java.util.Scanner;

public class student_grade {

    public static void main(String[] args) {
        int roll, m1, m2, m3, totel, avg;
        String name;
        Scanner scan = new Scanner(System.in);
        // System.out.println("enter the student name :");
        System.out.print("enter the student name :");
        name = scan.nextLine();
        System.out.println("ente`r roll number :");
        roll = scan.nextInt();
        System.out.println("enter m1 :");
        m1 = scan.nextInt();
        System.out.println("enterm m2 :");
        m2 = scan.nextInt();
        System.out.println("enterm m3 :");
        m3 = scan.nextInt();

        totel = m1 + m2 + m3;
        avg=totel/3;

        System.out.println("name :" + name + "\nroll : " + roll + "\ntotel : " + totel+"\naverage : "+avg+"\n");
        if(avg>=80){
            System.out.println("distinction !");
        }else if((avg<=80)&&(avg>=60)){
            System.out.println("frist class");
        }
        else if((avg<=60)&&(avg>=45)){
            System.out.println("Second class");
        }
        else{
            System.out.println("Fail");
        }
        scan.close();
    }
}