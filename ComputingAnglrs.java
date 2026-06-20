
package computinganglrs;

import java.util.Scanner;

public class ComputingAnglrs {

    public static void main(String[] args) {
      //home work angles of a triangle
        Scanner s=new Scanner(System.in);
        System.out.println("enter the x and y value for the point1:");
        double x1=s.nextDouble();
        double y1=s.nextDouble();
        System.out.println("enter the x and y value for the point2:");
        double x2=s.nextDouble();
        double y2=s.nextDouble();
        System.out.println("enter the x and y value for the point3:");
        double x3=s.nextDouble();
        double y3=s.nextDouble();
        double a=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double b=Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        double c=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
        double A=Math.acos((a*a-b*b-c*c)/(-2*b*c));
        int Ad=(int)Math.ceil(Math.toDegrees(A));
        double B=Math.acos((b*b-a*a-c*c)/(-2*a*c));
         int Bd=(int)Math.ceil(Math.toDegrees(B));
        double C=Math.acos((c*c-b*b-a*a)/(-2*a*c));
         int Cd=(int)Math.ceil(Math.toDegrees(C));
         if(Ad+Bd>=180 || Ad+Cd>=180||Bd+Cd>=180 ||Ad == 0 || Bd==0 || Cd==0){
             System.out.println("the points can't be a triangle!");
         }
         else{
         System.out.println("the angles of the triangle equals:\n"+"A="+Ad+" degree\nB="+Bd+" degree\nC="+Cd+" degree");
         }    
    }
    
}
