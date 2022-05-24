import java.util.Scanner;

public class Prime2 {
 
    public static void main(String[] args) {
        //range
        int num, min, max;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a min range: ");
        min=sc.nextInt();
        System.out.println("Enter a max range: ");
        max=sc.nextInt();
        System.out.println("The max and min range is: " +max+ " ->" +min);
        //find all prime numbers in the given range
        for(int n= min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}