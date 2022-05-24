import java.util.Scanner;

class Factorial2{
    public static void main(String args[]) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

         if(num>=0) 
        {
           //Call a recursive function to find the factorial
           int factorial=findFactorial(num);
           System.out.println("The factorial of the entered the number is :"+factorial);
        }        
        else
        {
            System.out.println("Factorial not possible.");
            System.out.println("Please enter valid input.");
        } 
    }
    //Recursive Function to Find the Factorial of a Number
    public static int findFactorial(int num)
    {
        if(num==0)
            return 1;
        else if(num==1)
            return 1;
        else
            return num*findFactorial(num-1);        
    }
}
