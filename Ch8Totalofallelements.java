
package ch8totalofallelements;

import java.util.Scanner;


public class Ch8Totalofallelements {

  
    public static void main(String[] args) {
       
Scanner s=new Scanner(System.in);
        System.out.println("Enter the array lenght of row");
        int row=s.nextInt();
        System.out.println("Enter the array lenght of column");
        int column=s.nextInt();
       int[][] matrix=new int[row][column];
       int tottal=0;
       for(int i=0;i<matrix.length;i++){
           System.out.println("enter "+row+" number for row "+(i+1));
           for(int j=0;j<matrix[i].length;j++){
               matrix[i][j]=s.nextInt();
               tottal+=matrix[i][j];
           }
       }
        System.out.println("your matrix are:");
       for(int i=0;i<matrix.length;i++){
           
           for(int j=0;j<matrix[i].length;j++){
               
           System.out.print(matrix[i][j]+" ");
       }
           System.out.println("");
           
       }
        System.out.println("the tottal of all elements are:"+tottal);
    }}

    
    

