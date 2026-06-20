
package insetionsort.java;

import java.util.Scanner;


public class InsetionSortJava {

    
    public static void main(String[] args) {
       int[] sort ={3,5,7,8};
       for (int i=0;i<sort.length-1;i++){
           for (int j=0;j<sort.length-1;j++){
               if(sort[j]<sort[j+1]){
                   int temp=sort[j];
                   sort[j]=sort[j+1];
                   sort[j+1]=temp;
               }
           }
       }
        System.out.print("There are sort numbers:");
        for(int numbers:sort){
            System.out.print(numbers+",");
        }
    }
    
}
