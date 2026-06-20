
package q1ch8;

import java.util.Scanner;


public class Q1ch8 {

    
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("Enter the array lenght of row");
        int row=s.nextInt();
        System.out.println("Enter the array lenght of column");
        int column=s.nextInt();
       int[][] matrix=new int[row][column];
       for(int i=0;i<matrix.length;i++){
           
           int tottal=0;
           System.out.println("enter "+row+" number for row "+(i+1));
           for(int j=0;j<matrix[i].length;j++){
               matrix[i][j]=s.nextInt();
               tottal+=matrix[i][j];
               
           }
           System.out.println("sum of column "+(i+1)+" is "+tottal);
       }
        System.out.println("your matrix are:");
       for(int i=0;i<matrix.length;i++){
           
           for(int j=0;j<matrix[i].length;j++){
               
           System.out.print(matrix[i][j]+" ");
       }
           System.out.println("");
           
       }
       
    }
    

    }
    

