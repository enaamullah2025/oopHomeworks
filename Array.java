
package array;
import java.util.Scanner;

public class Array {

    
    public static void main(String[] args) {
//  String[][] students= {
//                             {"102","ali","ahmadi","a"},
//                             {"103","ahmad","nazari","b"},
//                             {"104","layla","khuramay","c"}
//                         };
//        for(int x=0;x<students.length;x++){
//            for(int y=0;y<students[x].length;y++){
//            System.out.print(students[x][y]+" ,");}
//            System.out.println();
//
//
//int[] sourcearray={1,2,3,4,5};
//int[] copyarray={4,6,7,8,9};
//copyarray=sourcearray;
//for(int x:copyarray){
////    System.out.println(x);}
//        
//      Scanner s=new Scanner(System.in);
//        System.out.println("enter number of employee:");
//        int number=s.nextInt();
//      String[][] employee=new String[number][4]; 
//      
//      for(int x=0;x<number;x++){
//          System.out.println("enter employee information:");
//          for(int y=0;y<employee[x].length;y++){
//              if(y==0){
//              System.out.print("enter id:");}
//              else if(y==1){
//                  System.out.print("enter employee name:");}
//              else if(y==2){
//                  System.out.print("enter emoloyee position:");}
//              
//              else{
//                  System.out.println("enter your salary:");
//              }
//              employee[x][y]=s.next();
//          }
//      }
//      int counter=1;
//        for(String[] emp:employee){
//            counter =1;
//            for(String e:emp){
//                if(counter==1){
//                    System.out.print(" id is:"+e+" ");
//                }
//                else if(counter==2){
//                    System.out.print("name is:"+e+" ");
//                }
//                else if(counter==3){
//                    System.out.print("position is:"+e+" ");
//                }
//                else{
//                    System.out.print("salary is:"+e+" ");
//                }
//               counter++; 
//            }
//            System.out.println(",");
//        }

//int[] array={1,2,4,5};
//int[] narray=new int[array.length];
//for(int i=0;i<array.length;i++){
//    narray[i]=array[i];
//}
//
//Scanner s=new Scanner(System.in);
//        System.out.print("How many subject  did you study:");
//        int lenghtsubject=s.nextInt();
//        int[] score=new int[lenghtsubject];
//        for(int x=0;x<lenghtsubject;x++){
//            System.out.println("Enter your scores:");
//            score[x] =s.nextInt();
//        }
//        int tottalnumbers=sum(score);
//        System.out.println("your tottal numbers are:"+tottalnumbers);
//        float average=(float)tottalnumbers/(float)lenghtsubject;
//        System.out.println("your average number is :"+average);
//        System.out.println("your minimum numbber is:"+min(score));
//        System.out.println("your maximum number is:"+max(score));
//        
//            }
//    static int sum(int[] numbers){
//        int tottal=0;
//        for(int n:numbers){
//          tottal+=n;
//        }
//        return tottal;
//    }
//    static int max(int[] maximum){
//        int max=maximum[0];
//        for(int number:maximum){
//            if(number>max){
//                max=number;   
//            }
//        }
//        return max;
//    }
//    static int min(int[] num){
//        int minimum=num[0];
//        for(int min:num){
//            if(min<minimum){
//                minimum=min;
//            }
//            
//        }
//        return minimum;
   Scanner s=new Scanner(System.in);
      System.out.println("enter the array lenght");
        int lenght=s.nextInt();
        System.out.println("enter the"+lenght+" number for the array");
      int[] mylist=new int[lenght];
  for(int i=0;i<mylist.length;i++){
      mylist[i]=s.nextInt();
  }
  for(int num:mylist){
      System.out.print("you are array number are:"+num);
  }
  mylist[0]=12;
  mylist[1]=2;
  mylist[2]=32;
  mylist[3]=52;
    mylist[4]=22;
    for(int n:mylist){
        System.out.print(n+" ");
    }
int x=mylist.length;
        System.out.println("the lenght of array is"+x);}}
//  
//  
//      Scanner s=new Scanner(System.in);
//      System.out.println("enter the array lenght");
//      int lenght=s.nextInt();
//      int tottal=0;
//      double[] mylist=new double[lenght];
//      double max =mylist[0];
//      for(int i=0;i<lenght;i++){
//      mylist[i]=(int)(Math.random()*100);
//      int j=(int)(Math.random()*mylist.length);
//      double temp=mylist[i];
//      mylist[i]=mylist[j];
//      mylist[j]=temp;
//      tottal+=mylist[i];
//      if(max<mylist[i]){
//          max=mylist[i];
//      }
//      
//      }
//      for(double num:mylist){
//          System.out.print(num+"  ");
//      }
//        System.out.println("\n the tottal is:"+tottal);
//        System.out.println("hte max is:"+max);
//        
//      }      
//      }

