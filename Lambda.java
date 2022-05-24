interface Drawable{  
    public void draw();  
    public void draw2(); 
}  
  
public class Lambda {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        Drawable d3=()->{  
            System.out.println("Drawing "+width);  
        };  
        d3.draw(); 
        d2.draw();  
    }  
}  