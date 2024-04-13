import java.util.Scanner;

/**
 * extract
 */
public class extract {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        System.out.println("mention the string starting position");
        int start=sc.nextInt();
        System.out.println("enter the number of charecter to be selected :");
        int len=sc.nextInt();
        System.out.print("selected string is : ");;
        for(int i=start;i<len+start;i++)
            System.out.print(str.charAt(i));
        System.out.println();
    }


    }
