import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args)
{
int year;
boolean leap=false;
Scanner sc= new Scanner(System.in);
System.out.println("Enter year");
year= sc.nextInt(); 
    if (year%4==0 && (year%100!=0) || (year%400==0))
    {
        System.out.println("This is a leap year");
    }
    else{
        System.out.println("This is not leap year");
    }
    
}
}