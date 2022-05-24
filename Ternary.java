import java.util.*;

class Ternary {  
public static void main(String args[])   
{  
Scanner sc= new Scanner(System.in);
int number= sc.nextInt();  
System.out.println("Enter number");
String result = (number %2 == 0) ? "Divisible by 2" : "Not divisible by 2";
    System.out.println(result);
}  
}  