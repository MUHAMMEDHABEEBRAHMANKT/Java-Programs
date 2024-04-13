import java.util.Scanner;
public class Distence {
    int feet;
    float inch;
    public void  read(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the feet: ");
        feet=scan.nextInt();
        System.out.println("enter the inch: ");
        inch=scan.nextFloat();
    }
    public void sum(Distence d1,Distence d2){
        inch=(float)d1.inch+d2.inch;
        feet=(int)(d1.feet+d2.feet+(inch/12));
        inch=inch%12;
}
public void show(){
    System.out.println(feet+"fet and "+inch+"inches");
}
public static void main(String[] args) {
    Distence d1=new Distence();
    Distence d2=new Distence();
    Distence d3=new Distence();
    System.out.println("enter the frist distence");
    d1.read();
    System.out.println("enter the second distence");
    d2.read();
    d3.sum(d1,d2);
    System.out.print("tottal distence: ");
    d3.show();
}
}
