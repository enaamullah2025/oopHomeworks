
package bubblesort;

import java.util.Scanner;


public class Bubblesort {

    public static void main(String[] args) {
//        Scanner inpout =new Scanner(System.in);
//        System.out.println("Enter your number of element");
//       int lenght=inpout.nextInt();
//       int[] sort=new int[lenght];
//        System.out.println("Enter "+lenght+" elements:");
//        for(int i=0;i<lenght;i++){
//            int user=inpout.nextInt();
//            sort[i]=user;
//        }

int[] sort={8,3,5,4};
for(int i=0;i<sort.length-1;i++){
    for(int j=0;j<sort.length-1;j++){
        if(sort[j]>sort[j+1]){
            int temp=sort[j];
            sort[j]=sort[j+1];
            sort[j+1]=temp;
            
        }
    }
}
        System.out.print("sorted numbers are :");
               int k=0;
   for(int number :sort){
       if(k<3){
       System.out.print(number+",");}
       else{
           System.out.print(number);}
       k++;
//   }
//int[] sort={8,3,5,4,8,9};
//for(int i=0;i<sort.length-1;i++){
//    for(int j=0;j<sort.length-1;j++){
//        if(sort[j]>sort[j+1]){
//            int temp=sort[j];
//            sort[j]=sort[j+1];
//            sort[j+1]=temp;
//        }
//    }
//    
//}
//        System.out.print("sorted numbers are:");
//        for(int numbers:sort){
//            System.out.print(numbers+",");
//        }
//int[] a={8,5,6,3,};
//for(int x=0;x<a.length-1;x++){
//    for(int y=0;y<a.length-1;y++){
//        if(a[y]>a[y+1]){
//            int temp=a[y];
//            a[y]=a[y+1];
//            a[y+1]=temp;
//        }
//    }
//}
//for(int number:a){
//    System.out.print(number+",");
//}
//    }
//    
//    static int boubble(int[] numbers){
//        for(int i=0;i<numbers.length;i++){
//            for(int j=0;j<numbers.length-1;j++){
//                if(numbers[j]>numbers[j+1]);
//                int temp=numbers[j];
//                numbers[j]=numbers[j+1];
//                numbers[j+1]=temp;
//                
//                
//            }
//        }
    }
    
}
