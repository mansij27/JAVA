import java.util.Scanner;
public class Switch{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the week days");
int weekday = scanner.nextInt();
    if(weekday == 1){
        System.out.println("Monday");
    } 
    else if(weekday == 2) {
        System.out.println("Tuesday");
    } 
    else if(weekday == 3) {
        System.out.println("Wednesday");
    }
    else if(weekday == 4) {
        System.out.println("Thursday");
    } 
    else if(weekday == 5) {
        System.out.println("Friday");
    } 
    else if(weekday == 6) {
        System.out.println("Saturday");
    } 
    else if(weekday == 7) {
        System.out.println("Sunday");
    } 
    else {
        System.out.println("Enter the numbers between 1 to 7");
    }
}
}