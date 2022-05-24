import java.util.Scanner;

class Palindrome2{
  public static void main(String args[]){
    int num, r, temp, sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any number:");
num=sc.nextInt();

temp=num;
while(num>0){
  r= num % 10;
  sum = (sum*10) +r;
  num=num/10;
}
if(temp==sum)
System.out.println("Palindrome number");
else
System.out.println(" Not Palindrome number");
  }
}