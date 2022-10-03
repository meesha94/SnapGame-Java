import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CardGame {
   private ArrayList<Card> cards;
   private static final String rank[]={"Ace", "1", "2", "3","4","5","6","7","8","9","Jack","Queen","King"};
    private static final int value[]={0, 1, 2, 3,4,5,6,7,8,9,10,11,12};
   private String suit[]={String.valueOf('\u2660'), String.valueOf('\u2660'), String.valueOf('\u2665'), String.valueOf('\u2663')};


    public CardGame(){
        createDeck();
    }
    public void createDeck(){
        cards = new ArrayList<Card>();
    for(int i = 0; i<suit.length; i++){
        for (int j = 0; j<rank.length; j++) {
            for (int k = 0; k < value.length; k++) {
                this.cards.add(new Card(rank[j], suit[i], value[i]));
            }
        }
    }
}

    public ArrayList<Card> getDeck(){
        return cards;
    }
}
