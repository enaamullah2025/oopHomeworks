
package findintowpoint;

public class Findintowpoint {


    public static void main(String[] args) {
       double[][] points={{-1,3},{-1,-1},{1,1},{0.5,2},{3,3},{2,4},{-0.5,4},{1,2}};
       int p1=0;
       int p2=1;
       double shartD=distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
    }
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    
}
