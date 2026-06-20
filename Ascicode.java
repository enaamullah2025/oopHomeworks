
package ascicode;

import java.util.Scanner;

public class Ascicode {

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter a number from 1 to 127:");
        int ascicode=s.nextInt();
        char character=(char)ascicode;
        System.out.println("the character for ascicode "+ascicode+" is "+character);
    }
    
}
