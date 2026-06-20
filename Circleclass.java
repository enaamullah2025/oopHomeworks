
package circleclass;

public class Circleclass {


    public static void main(String[] args) {
        circle c1=new circle();
        System.out.println("The area of circle whith radius "+c1.radius+" is "+c1.getArea());
         circle c2 =new circle(25);
         System.out.println("The area of circle whith radius "+c2.radius+" is "+c2.getArea());
        circle c3 =new circle(125);
        System.out.println("The area of circle whith radius "+c3.radius+" is "+c3.getArea());
        
        c2.radius=100;
        System.out.println("The area of circle whith radius "+c2.radius+" is "+c2.getArea());
          }  
}
class circle{
   double radius;
   
   
circle(){
    radius=1;
}
circle(double newradius){
 radius= newradius;  
}
double getArea(){
    return radius *radius*Math.PI;
}
double getPerimeter(){
    return 2*Math.PI*radius;
}
void setRadius(double newRadius){
    radius =newRadius;
    
}
}
