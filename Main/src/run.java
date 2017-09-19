import java.util.Random;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {
        run methods = new run();
        methods.task1();
        methods.task2();
        methods.task3();
        methods.task4();
        methods.task5();
    }


    private int inputNumber(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        try {
            return Integer.parseInt(in.nextLine());
        } catch (NumberFormatException exc) {
            System.out.println(exc + "\nThat is incorrect,\nPlease try again.");
            return inputNumber(msg);
        }
    }

    private void task1() {
        System.out.println("Task 1: Largest Number");
        int numA = inputNumber("Enter the first number: ");
        int numB = inputNumber("Enter the second number: ");
        if (numA > numB) {
            System.out.println("The first number was biggest, " + numA);
        } else if (numA == numB) {
            System.out.println("The numbers are equal, " + numA + ", " + numB);
        } else {
            System.out.println("The second number was biggest, " + numB);
        }
    }

    private void task2() {
        System.out.println("Task 2: What is the day?");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int num = inputNumber("Enter the day: ");
        if (-1 < num && num < 7) {
            System.out.println("The day is: " + days[num]);
        } else {
            System.out.println("That is incorrect,\nPlease try again.");
            task2();
        }
    }

    private void task3() {
        System.out.println("Task 3: Dice Roll");
        int[] diceRolls = new int[3];
        Random rand = new Random();
        for (int x = 0; x < diceRolls.length; x++) {
            diceRolls[x] = rand.nextInt(6) + 1;
            System.out.println("Dice roll " + x + " was " + diceRolls[x]);
        }
    }

    private void task4() {
        System.out.println("Task 4: Dog Age to Human Age");
        int dogAge = inputNumber("Please enter the age of the dog: ");
        int humanAge;
        if (dogAge <= 2) {
            humanAge = 12 * dogAge;
        } else {
            humanAge = 24 + (6 * (dogAge - 2));
        }
        System.out.println("The human age of " + dogAge + " is " + humanAge);
    }

    private void task5() {
        System.out.println("Task 5: Adding numbers");
        int[] numbers = {2, 5, 3, 6, 2, 3, 6, 4};
        int total = 0;
        for (int current : numbers) {
            total += current;
        }
        System.out.println("The total is: " + total);
    }
}
