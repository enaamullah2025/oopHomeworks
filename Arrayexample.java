
package arrayexample;

import java.util.Scanner;


public class Arrayexample {
    
    public static void main(String[] args) {
//String[] student={"ali","ahmad","mohamad","enaam"};
///*
//for(int x=0;x<4;x++){
//    System.out.println(student[x]);
//} */
//for(String x :student){
//   // System.out.println(x);
//}
//for(int i=1;i<=10;i++){
//    for(int j=2;j<=10;j++){
//        System.out.print(i+"x"+j+"="+j*i+"\t");
//    }
//    System.out.println();
//}

String[] weekday={"sat","sun","mon","tus","wedn","thur","fri"};
    for(String day:weekday)
        System.out.println(day);

        System.out.println("..............");
        for (int x=0;x<7;x++){
            System.out.println(weekday[x]);
while(x<7){
    System.out.println(weekday[x]);
    x++;
        }


for(String day:weekday){
    System.out.println(day);
}}


//Scanner s=new Scanner(System.in);
//        System.out.println("enter your favorite number:");
//        int num=s.nextInt();
//int[] score=new int[num];
//        System.out.println("entr your scores:");
//for(int x=0;x<score.length;x++)
//        score[x]=s.nextInt();
//       
//int tottal=0;
//for(int x : score){
//    tottal+=x;
//}
//        System.out.println("thier is your tottals numbers:"+tottal);
//    }
//    
//}
//