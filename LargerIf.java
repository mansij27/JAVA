import java.util.Scanner;
public class LargerIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3)
                System.out.println("Num1"+ " " + num1 + " is the greatest");
        }
        if(num2>num1)
        {
             if(num2>num3)
                 System.out.println("Num2"+ " " + num2 + " is the greatest");
         if(num3>num1)
         {
             if(num3>num2)
                 System.out.println("Num3"+ " " + num3 + " is the greatest");
         }
        }
    }
}

//Only using if nested