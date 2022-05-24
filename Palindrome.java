import java.util.Scanner;

class Palindrome{  
public static void main(String args[])
{ 
int num, r, temp,sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number: ");
num=sc.nextInt();
temp=num;    
  while(num>0){    
   r=num % 10;  
   sum= (sum *10) +r;    
   num= num/10;    
  }    
    if(temp == sum)    
    System.out.println("palindrome number ");    
    else    
    System.out.println("not palindrome");
}
}