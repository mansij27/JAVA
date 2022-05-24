import java.util.*;
class operations{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in); //System.in is standard input stream
System.out.print("Enter first number-");
int a=sc.nextInt();
System.out.print("Enter second number-");
int b=sc.nextInt();
int c=a+b;
int d=a-b;
int e=a*b;
System.out.println("Addition= " +c);
System.out.println("Subtraction=" +d);
System.out.println("Multiplication=" +e);
}
}
