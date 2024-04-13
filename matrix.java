import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the number of rows:");
        int row =sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column=sc.nextInt();
        int [][] a=new int[row][column];  //declaring and creating object of array
        System.out.println("enter the elements:");
        for (int i=0 ;i<row ;i++)   //loop to enter element in array        
        {
            for(int j=0 ;j<column ;j++)
            {
            a[i][j]=sc.nextInt();         //user will give input so we use nextInt() method
        }
        }
        row=a[0].length;
        column=a[0].length;
        for(int i=0;i<row;i++){
            int sumrow=0;
            for(int j=0;j<column;j++){
                
                sumrow+=a[i][j];     //sum of each row is calculated by adding all the elements of that particular

            }
            System.out.println("sumof "+(i+1)+"row" +" is : "+sumrow);
        }
        sc.close();
  }
}