// BOTH ARE CORRECT

interface A{
    void fly();
}
interface D{
    void walk();
}
class Testing implements A,D{
        public void fly(){
            System.out.println("Flying class");
        }
        public void walk(){
            System.out.println("walking class");
        }
}

public class InterfaceExample{
    public static void main(String args[]){
        Testing ts=new Testing();
        ts.fly();
        ts.walk();
    }
}

// METHOD 2

// interface B{
//     void showB();
// }
// interface C{
//     void showC();
// }
// public class InterfaceExample implements B, C{
//     public static void main(String[] args){
//         InterfaceExample st = new InterfaceExample();
//         st.showB();
//         st.showC();
//     }

//     @Override
//     public void showB() {
//         System.out.println("Interface B");
//     }
//     @Override
//     public void showC() {
//         System.out.println("Interface C");
//     }
// }