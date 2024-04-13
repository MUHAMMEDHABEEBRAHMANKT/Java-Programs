//find area of the circle 
import java.util.Scanner;
public class area {
    double pi=3.14,r,res;
    public void in(){
        System.out.println("enter the radius of the circle");
        Scanner scan=new Scanner(System.in);
        r=scan.nextFloat();
        scan.close();
    }
    public void pro(){
        res=pi*r*r;

    }
    public void op(){
        System.out.println("the area of the circle is :"+res);
    }
    public static void main(String[] args) {
        
        area run=new area();
        run.in();
        run.pro();
        run.op();
     
    }
}
