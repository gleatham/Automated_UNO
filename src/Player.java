public class Player {
    String name;
    int numCards;
    //Card hand[]; array of the card class
    //filler for testing purposes
    String[] hand = new String[] {"Green 1", "Blue 7", "Wild Draw Four", "Yellow 4", "Red 5", "Yellow Skip", "Blue Reverse"};

    Player(){
        this.name = "Default";
        this.numCards = 7;

    }

    Player(String name) {
        this.name = name;
    }

    //Change String to CARD!
    public void printHand(String [] hand){
        int i = hand.length;
        System.out.println(i);
    }

    //Change String to CARD!
    public void playCard(String [] hand){

    }
}
