
package card;

public class Card {

    
    public static void main(String[] args) {
        String[] suits={"speads","heart","dimond","club"};
        String[] cards={"ace","2","3","4","5","6","7","8","9","10","jack","Queen","king"};
        int[] deck=new int[52];
        for(int i=0;i<deck.length;i++){
            deck[i]=i;
        }
        for(int i=0;i<deck.length;i++){
            int randome=(int)(Math.random()*deck.length);
            int temp=deck[i];
            deck[i]=deck[randome];
            deck[randome]=temp;
        }
        for(int i=0;i<4;i++){
            String suit=suits[deck[i]/13];
            String card=cards[deck[i]%13];
             System.out.println("card is: "+card+"  suit is :"+suit);
        }  

    }
    
}
