class Person{ 
    void test(){
        System.out.println("I am a person");
    }
}

class Student extends Person{
    void test1(){
        System.out.println("I am student");
    }
}

class Inheritance {
    public static void main(String args[]){
        Person p1=new Student();
        Student p2=new Student();
        p1.test();
        p2.test1();
    }    
}
