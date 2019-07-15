public class Player {
    String name; //String "PLAYER" + (array index +1)
    int numCards;
    Card[] hand = new Card[20];
    Boolean winner = false;

    Player(){
        this.name = "Default";
        this.numCards = 7;
    }

    Player(String name){
        this.name = name;
        this.numCards = 7;
    }

    Player(String name, Card [] deck){
        this.name = name;
        this.numCards = 7;
    }

    public void playCard(Card discard){
        System.out.println(this.name + "'s turn.");
        System.out.println(this.numCards + " cards in hand.");
        boolean match = false;
        for(int i = 0; i < this.hand.length; i++){
            if(hand[i] == null)
                continue;
            if(hand[i].color == discard.color || hand[i].value == discard.value){
                discard = hand[i];
                hand[i] = null;
                this.numCards--;
                match = true;
                for(int c = i; c < 20; c++){
                    int tempIndex = i;
                    if(hand[c] == null){
                        hand[tempIndex] = hand[c - 1];
                    }
                }
            }
        }
        if(!match){
            drawCard();
        }
    }

    private void drawCard(){

    }
}
