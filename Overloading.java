class OverLoad{
    void test(){
        System.out.print("Rose is a beautiful flower");
         System.out.print("Rose is a beautiful flower");
    }
      string test(string a){
         System.out.print("Sunflower is a beautiful flower" +a);
         return a*a;
    }
      string test(string a, int b){
        System.out.print("Mariegold is a beautiful flower" +a+ " " +b);
    }
}

class Overloading{
    public static void main(String[] args){
        OverLoad ob= new OverLoad();
        ob.test();
        ob.test("A");
        ob.test("B", 5);
    }
}