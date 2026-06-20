
package ch11.casting.demo;


public class Ch11CastingDemo {

    public static void main(String[] args) {
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(4,6);
        System.out.println("مساحت دایره:"+c.getArea());
       System.out.println("قطر دایره:"+c.getDiametre());
       System.out.println("مساحت مستطیل:"+r.getArea());
    }
    
}
class Gmo{
    public double getArea(){
        return 0;
    }
}
class Circle extends Gmo{
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius *radius;
    }
   // قطر دایره
    public double getDiametre(){
        return 2*radius;   
}
}
//مستطیل 
class Rectangle extends Gmo {
    private double width, height;
    public Rectangle(double widht,double height){
        this.height=height;
        this.width=widht;
}
    public double getArea(){
        return width*height;
    }
}

