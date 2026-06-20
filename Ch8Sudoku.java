
package ch8sudoku;

import java.util.Scanner;

public class Ch8Sudoku {


    public static void main(String[] args) {
       int[][] grid=new int[9][9];
        Scanner input=new Scanner(System.in);
        System.out.println("enter 9x9 sudoku:");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                grid[i][j]=input.nextInt();
                System.out.println("");
            }}
        if(isValid(grid)){
            System.out.println("valid sudoku");
        }
        else{
            System.out.println("invalid sudoku");
        }
        input.close();}
 static boolean isValid(int[][] grid){
        for(int i=0;i<9;i++){      
                if(!check(grid,i,0,0,1))return false;}
        
                 for(int i=0;i<9;i++){      
                if(!check(grid,0,i,1,0))return false;
                 }
            
        for(int r=0;r<9;r+=3){
            for(int c=0;c<9;c+=3){
                if(!checkBlock(grid,r,c))return false;       
            }
        }
                return true;
            }
         
         public static boolean check(int[][] grid,int row,int col,int dr ,int dc){
        boolean[] seen=new boolean[10];
        for(int i=0;i<9;i++){
                int num=grid[row+i*dr][col+i*dc];
                if(num<1||num>9|| seen[num]){
                    return false;
                }
                seen[num]=true;
            }
            return true;
    }
    public static boolean checkBlock(int[][] grid,int row,int col){
        boolean[] seen=new boolean[10];
        for(int r=row;r<row+3;r++){
            for(int c=col;c<col+3;col++){
                int num=grid[r][c];
                if(num<1||num>9|| seen[num]){
                    return false;
                }
                seen[num]=true;
            }}
            return true;
        }      
    }    

    

