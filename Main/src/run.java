import java.util.Random;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {
        run methods = new run();
/*        methods.task1();
        methods.task2();
        methods.task3();*/
        methods.task4();
    }

    private void task1() {
        Scanner in = new Scanner(System.in);
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
        } catch (NumberFormatException exc) {
            System.out.println("That is not a number,\nPlease try again.");
            task1();
        }
    }

    private void task2() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day: ");
        try {
            int num = Integer.parseInt(in.nextLine());
            if (num < 7) {
                System.out.println("The day is: " + days[num]);
            } else {
                System.out.println("That number is too big,\nPlease try again.");
                task2();
            }
        } catch (NumberFormatException exc) {
            System.out.println("That is not a number,\nPlease try again.");
            task2();
        }
    }

    private void task3() {
        int[] diceRolls = new int[3];
        Random rand = new Random();
        for (int x = 0; x < diceRolls.length; x++) {
            diceRolls[x] = rand.nextInt(6) + 1;
            System.out.println("Dice roll " + x + " was " + diceRolls[x]);
        }
    }

    private void task4(){
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter the age of the dog: ");
        try {
        int dogAge=Integer.parseInt(in.nextLine());
        int humanAge;
        if(dogAge<=2){
            humanAge=12*dogAge;
        }else {
            humanAge=24+(6*(dogAge-2));
        }
        System.out.println("The human age of "+dogAge+" is "+humanAge);
        } catch (NumberFormatException exc) {
            System.out.println("That is not a number,\nPlease try again.");
            task1();
        }
    }
}
