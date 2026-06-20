
package lottonumber;

import java.util.Scanner;


public class Lottonumber {

 
    public static void main(String[] args) {
     boolean[] coverd=new boolean[100];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers between 0 to 99:");
        System.out.println("Enter 0 for stop");
        while(true){
            int number=s.nextInt();
            if(number==0){
                break;   
            }
             coverd[number]=true;
        }
        
         boolean allcoverd =true;
        for(int i=1;i<=99;i++){
            if(coverd[i]==false){
             allcoverd=false;
                break;
            }
        }
       if(allcoverd==true){
           System.out.println("All coverd are true");}
           else{
           System.out.println("All coverd are false");                            
       }
    }
    
}
