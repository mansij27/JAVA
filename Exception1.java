class Exception1{
     public static void main(String[] args){
         int a,b;
    try{
        a=0;
        b=42/a;
        System.out.println("Result");
    }
catch(ArithmeticException e){
System.out.println("Divide by zero");
}
System.out.println("After Exception");
    }
}