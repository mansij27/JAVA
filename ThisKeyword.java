class Parent{
    int a=10;
    static int b=20;
    // Parent(){
    //     System.out.print("Super construct called");
    // }
}

class  Student extends Parent{
    int rollno;
    String name;
    float fee;
    // FIRST STATEMENT HOGI TABHI IT WILL WORK
    // Student(){
    //     super();
    //     System.out.print("i am student");
    // }
    Student(int rollno, String name, float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void rr(){
        System.out.println("Super constructor a" + super.a);
        System.out.println("Super constructor b" + super.b);

    }
    void display(){
        System.out.println("Name " +name+ " rollno " +rollno+ " fee " +fee);
    }
}
class ThisKeyword{
    public static void main(String args[]) {
        // Student s=new Student();
        Student s1= new Student(11, "Mansi", 1000f);
        Student s2= new Student(12, "Hello", 1000f);
        s1.display();
        s2.display();
        s1.rr();
    }
}

// ANOTHER EXAMPLE
// class ThisKeyword{
//     int first=22;
//     int second=33;
//     void gracia(int a, int b){
//         a=this.first;
//         b=this.second;
//         System.out.println("First" +first);
//         System.out.println("second" +second);
//         System.out.println("a" +a);
//         System.out.println("b" +b);

//     }
//     void loius(int m, int n){
//         this.first=m;
//         this.second=n;
//         System.out.println("First" +first);
//         System.out.println("second" +second);
//         System.out.println("m" +m);
//         System.out.println("n" +n);
//     }
//     public static void main(String args[]) {
//         new ThisKeyword().gracia(100,200);
//         new ThisKeyword().loius(1,2);
//     }
//     //when calling gracia takes a=this.first ki wjh se vo uski value le rha h
// }

