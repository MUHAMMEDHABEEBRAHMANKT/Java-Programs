
// package Vector;
// import java.io.*;
import java.util.Vector;

public class vecter {
    public static void main(String[] args) {
        Vector vc = new Vector();
        System.out.print("\nements: ");
        vc.add(1);
        vc.add(2);
        vc.add("helo");
        System.out.print(vc);
        System.out.println("\nremoving:\n");
        //removing elem from the vector
        vc.remove(2);
        vc.remove("hi");
        System.out.println("after removing :" + vc);
        System.out.println("\ninter changing elements: \n");
        //changing 
        vc.set(1, 1);
        vc.set(0, 2);
        System.out.println("after inter changing elements: :" + vc);
        System.out.println(vc.size());
        System.out.println(vc.capacity());

    }

}
