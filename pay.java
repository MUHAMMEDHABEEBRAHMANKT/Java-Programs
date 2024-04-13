import java.util.Scanner;

public class pay {
    String name;
    float salary;
    float hra;
    float da;
    float pf;
    float grossal;
    float netsal;

    pay(String name, float salary) {
        name = name;
        salary = salary;
        da = hra = pf = grossal = netsal = 0;
    }

    void calc() {
        da = 15f / 100 * salary; // Use 15f / 100 for float division
        hra = 10f / 100 * salary;
        pf = 12f / 100 * salary;
        grossal = salary + da + hra;
        netsal = grossal - pf;
    }

    void dp() {
        System.out.println("Name is: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("DA Allowance: " + da);
        System.out.println("House Rent Allowance: " + hra);
        System.out.println("Provident Fund: " + pf);
        System.out.println("Gross Salary: " + grossal);
        System.out.println("Net Salary: " + netsal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter salary: ");
        float salary = scan.nextFloat();
        pay obj = new pay(name, salary);
        obj.calc();
        obj.dp();
        scan.close(); // Close the scanner after use
    }
}
