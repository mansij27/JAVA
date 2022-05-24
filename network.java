import java.util.*;
public class network {
    public static void main(String[] args) {
         int a=0,b=0,c=0,d=0;
        System.out.println("Enter the IP adress");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first octet");
        a=sc.nextInt();
        System.out.println("enter the second octet");
         b=sc.nextInt();
         System.out.println("enter the third octet");
        c=sc.nextInt();
        System.out.println("enter the fourth octet");
        d=sc.nextInt();
        System.out.println(checkIP(a,b,c,d));
    }
   
   
    public static String checkIP(int a,int b,int c,int d)
    {
        if(a>254 || b>255 || c>255 || d>255)
        return  "Invalid IP address";
   
        if(a==0 || a==128)
        return "this is a loopback address";
       
        if(a>=1 && a<=127)
        return "This IP address belongs to CLASS A";
       
        if(a>=129 && a<=191)
        return "This IP address belongs to CLASS B";
       
        if(a>=192 && a<=223)
        return "This IP address belongs to CLASS C";
       
        if(a>=224 && a<=239)
        return "This IP address belongs to CLASS D";
       
        if(a>=240 && a<=254)
        return "This IP address belongs to CLASS E";
       
        return "";
    }
}