import java.util.Scanner;

class Task002 {
    private final static String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    static void run() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the day: ");
        try {
            int num = Integer.parseInt(in.nextLine());
            if(num<7) {
                System.out.println("The day is: "+days[num]);
            }else{
                System.out.println("That number is too big,\nPlease try again.");
                run();
            }
        }catch (NumberFormatException exc){
            System.out.println("That is not a number,\nPlease try again.");
            run();
        }
    }


}
