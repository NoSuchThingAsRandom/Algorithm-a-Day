import java.util.Scanner;

public class Task001 {
    public void run(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numA=Integer.parseInt(in.nextLine());
        System.out.println("Enter the second number: ");
        int numB=Integer.parseInt(in.nextLine());
        if(numA>numB){
            System.out.println("The first number was biggest, "+numA);
        }else if(numA==numB){
            System.out.println("The numbers are equal, "+numA+", "+numB);
        }else {
            System.out.println("The second number was biggest, "+numB);
        }

    }


}
