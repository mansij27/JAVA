class Demo{
    static int num=5;
    static void show(){
        System.out.println("World");
    }
}

class StaticTest {
    public static void main(String args[]){
        System.out.println("Hello");
        Demo.show(); //Directly calling show from outside class without obj bcoz it is static
        // System.out.println(num); //This line gives error 
        System.out.println(Demo.num); // Invoke through class name
    }
}

// ANOTHER EXAMPLE
class StaticTest {  
    static int a = 3; 
    static int b; 
    static void meth(int x) { 
        System.out.println("x = " + x); 
        System.out.println("a = " + a); 
        System.out.println("b = " + b);
    }
    static { 
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String args[]) { 
        meth(42); 
    }
}
