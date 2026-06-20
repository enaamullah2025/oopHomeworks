
package ch8shufling;

import java.util.Scanner;


public class Ch8Shufling {

   
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
        System.out.println("Enter the lenght of row");
        int row=s.nextInt();
        System.out.println("Enter hte lenght of column");
        int column=s.nextInt();
        int[][] matrix=new int[row][column];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(int)(Math.random()*100);
            }
        }
        for(int [] num:matrix){
            for(int numbers:num){
                System.out.print(numbers+" ");
            }
            System.out.println("");
        }
           }
    public static void shuffling(int [][] numbers){
       for(int i=0;i<numbers.length;i++){
           for(int j=0;j<numbers[i].length;j++){
               int randomrow=(int)(Math.random()*numbers.length);
               int randomcolumn=(int)(Math.random()*numbers[i].length);
               int temp=numbers[i][j];
               numbers[i][j]=numbers[randomrow][randomcolumn];
               numbers[randomrow][randomcolumn]=temp;
               
           }
       }
    }
}

    
   

