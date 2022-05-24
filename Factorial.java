import java.util.Scanner;

class Factorial{
    public static void main(String args[]){
        int n,i, factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();

        for(i=1; i<=n;i++){
            factorial = factorial * i;
        }
        System.out.printf("Factorial of the number is: " +factorial );
    }
}

