import java.util.Scanner;

public class NestedIf{
    public static void main (String[] args)
    {
Scanner sc= new Scanner(System.in);
System.out.println("Enter your age:\nEnter Your Weight:");
int age = sc.nextInt();
int weight = sc.nextInt();
    if (age>=18){
        if (weight>50){
            System.out.println("You are eligible to donate blood");
        }
        else{
            System.out.println("You are not eligible to donate blood");
        }
    }
    else{
        System.out.println("Age must be above 18");
    }
}
}