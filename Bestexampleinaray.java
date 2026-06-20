
package bestexampleinaray;
import java.util.Scanner;

public class Bestexampleinaray {

    
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        System.out.print("Enter number of employee:");
        int number=s.nextInt();
        String[] employee=new String[number];
        int [] salary=new int[number];
        for(int x=0;x<number;x++){
            System.out.println("Enter employee name:");
            employee[x]=s.next();
            System.out.println("Enter salary "+employee[x]+" :");
            salary[x]=s.nextInt();
        }
        int i=0;
        for(String e:employee){
            System.out.println((i+1)+":"+e+" ,"+salary[i]);
            i++;
        }
        for (int j=0;j<number;j++){
        System.out.print("chose  number of employee:");
        int noe=s.nextInt();
        System.out.println("Enter number of absent day "+employee[noe-1] +":");
        int abd=s.nextInt();
         System.out.println("Enter number of over time hour "+employee[noe-1] +":");
        int ovt=s.nextInt();
         System.out.println("this is net salary "+calcsalary(salary[noe-1],abd,ovt));
        }
    }
    static int calcsalary(int gross_salary,int absent_dayes,int overtime ){
        float spd=(float)gross_salary/(float)30;
        float sph=spd/(float)8;
        int absent_amount=(int)(absent_dayes*spd);
        int over_time=(int)(sph*overtime);
        return gross_salary-absent_amount+over_time;
        
    }
}
