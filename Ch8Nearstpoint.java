
package ch8nearstpoint;

public class Ch8Nearstpoint {

    
    public static void main(String[] args) {
        double[][] points={
            {-1,-1},
            {1,1},
            {3,3},
            {4,2} ,
            {1.5,3}
        };
        int p1=0, p2=1;
        double shortestDistance=distance(points[0],points[1]);
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                double d=distance(points[i],points[j]);
                if(d<shortestDistance){
                    shortestDistance=d;
                    p1=i;
                    p2=j;
                }
            }
        }
        System.out.println("Nearest points:");
        System.out.println("point "+p1+":("+points[p1][0]+","+points[p1][1]+")");
        System.out.println("point "+p2+":("+points[p2][0]+","+points[p2][1]+")");
        System.out.println("Distance: "+shortestDistance );

    }
     static double distance(double[] a,double[] b){
return Math.sqrt(Math.pow(a[0]-b[0], 2)+Math.pow(a[1]-b[1],2));
           }
    
}
