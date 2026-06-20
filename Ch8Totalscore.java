 
 
package ch8totalscore;

public class Ch8Totalscore {


    public static void main(String[] args) {
      double[][][] Scores={
          {{80,75},{90,85}},
          {{78,75},{65,85}},
          {{80,75},{77,87}},
      };
      for(int s=0;s<Scores.length;s++){
          double total=0;
          for(int exam=0;exam<Scores[s].length;exam++){
              for(int part=0;part<Scores[s][exam].length;part++){
                  total+=Scores[s][exam][part];
              }
          }
          System.out.println("student "+s+" total score: "+ total);
      }
              
    }
    
}
