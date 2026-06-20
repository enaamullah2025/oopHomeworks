
package ch8printarray;

import java.util.Scanner;

public class Ch8PrintArray {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array lenght of row");
        int row=s.nextInt();
        System.out.println("Enter the array lenght of column");
        int column=s.nextInt();
       int[][] matrix=new int[row][column];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               matrix[i][j]=(int)(Math.random()*100);
           }
       }
       for(int[] num:matrix){
           for(int numbers:num){
           System.out.print(numbers+" ");
       }
           System.out.println("");
       }

    }
    
}
