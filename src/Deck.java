import java.util.*;

public class Deck {

    Card[] deck = new Card[108];
    private int deckIndex = 0;
    Card discard = new Card(20, 20);

    Deck(){
        //add 1x 0 value cards of each color
        for(int c = 0; c < 4; c++)
            for(int i = 0; i < 1; i++){
                int val = 0;
                deck[deckIndex] = new Card(c, val);
                deckIndex++;
            }

        //add 1-9 of each color
        for(int c = 0; c < 4; c++)
            for(int i = 1; i < 10; i++) {
                deck[deckIndex] = new Card(c, i);
                deckIndex++;
                deck[deckIndex] = new Card(c, i);
                deckIndex++;
            }

        //add special cards
        //DrawTwo == 10
        //Skip == 11
        //Reverse ==12
        int value = 10;
        for(int c = 0; c < 4; c++)
            for(int i = 0; i < 3; i++){
                deck[deckIndex] = new Card(c, value);
                deckIndex++;
                deck[deckIndex] = new Card(c, value);
                deckIndex++;
                value++;

                if(value == 13)
                    value = 10;

            }

        //add Wilds
        value = 13;
        for(int i = 0; i < 8; i++) {
            deck[deckIndex] = new Card(4, value);
            deckIndex++;

            if(i == 3)
                value++;
        }
    }

    public void shuffle() {
        Random r = new Random();
        Card temp = new Card(20, 20);
        Card temp2 = new Card(20, 20);
        for(int i = 0; i < 10001; i++){
            int c = r.nextInt(108);
            temp = this.deck[c];
            temp2 = this.deck[107];

            this.deck[107] = temp;
            this.deck[c] = temp2;
        }
    }

    public void deal(Player [] players) {
        deckIndex = 0;
        for(int i = 0; i < 4; i++)
            for(int c = 0; c < 7; c++){
                players[i].hand[c] = this.deck[deckIndex];
                deckIndex++;
            }

        discard = deck[deckIndex]; //
        deckIndex++;
    }

}
