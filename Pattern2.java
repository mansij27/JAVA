import java.util.Scanner;

class Pattern2 {
    public static void main (String[] args)
{
int num;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
num= sc.nextInt();
    for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            } 
            System.out.println();
        }
}
}