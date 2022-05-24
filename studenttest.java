class Student {
    String Sname;
    String Course;
    int Age;

    Student(String Sname, String Course, int Age){
        this.Sname= Sname;
        this.Course=Course;
        this.Age= Age;
    }

    void read(){
        System.out.println(Sname);
        System.out.println(Course);
        System.out.println(Age);
    }

    void showVal(String val1, String val2, int val3){ 
        Sname = val1;
        Course = val2;
        Age = val3;

        System.out.println(Sname);
        System.out.println(Course);
        System.out.println(Age);
    }
}

public class studenttest{
    public static void main(String []args){
    Student s1= new Student("abc", "bca", 18);
    s1.read();
    s1.showVal("mansi", "mca", 21);
    }
}

    