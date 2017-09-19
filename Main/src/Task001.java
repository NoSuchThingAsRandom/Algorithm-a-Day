import java.util.Scanner;

class Task001 {
    void run(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        try {
            int numA = Integer.parseInt(in.nextLine());
            System.out.println("Enter the second number: ");
            int numB = Integer.parseInt(in.nextLine());
            if (numA > numB) {
                System.out.println("The first number was biggest, " + numA);
            } else if (numA == numB) {
                System.out.println("The numbers are equal, " + numA + ", " + numB);
            } else {
                System.out.println("The second number was biggest, " + numB);
            }
        }catch (NumberFormatException exc){
            System.out.println("That is not a number,\nPlease try again.");
            run();
        }

    }


}
