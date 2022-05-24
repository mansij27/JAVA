import java.util.Scanner;

public class Menu {
    static int num1 = 0;
    static Scanner sc = new Scanner(System.in);

    static void Os() {
        System.out.println("Windows linux");
    }

    static void Browser() {
        System.out.println("Chrome");
    }

   public static void main(String[] args) {
        NumPlay np1 = new NumPlay();

        System.out.println("Enter a number ");
        num1 = sc.nextInt();
        // System.out.println("\nEnter a num2: ");
        // num2 = sc.nextInt();

        while (true) {
            System.out.println(np1.getMenu());
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    Os();
                    break;
                case 2:
                   Browser();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
    }
   }
}
}


class NumPlay {
    public String getMenu() {
        return "1. Select your operating system \n" +
                "2. Select your browser \n" +
                "0. Exit Program \n" +
                "   Enter your choice \n";
    }
}