public class UNODriver {
    public static void main(String [] args){

        //Create and shuffle deck
        Deck deck = new Deck();
        deck.shuffle();

        //Creat array of players; fill array
        Player[] players = new Player[4];
        for(int i = 0; i < 4; i++){
            players[i] = new Player("Player " + (i + 1));
        }

        //Deal cards to each player
        deck.deal(players);
        boolean game = true;

        do {
            for(int i = 0; i < 4; i++){
                players[i].playCard(deck.discard);
                if(players[i].numCards == 0) {
                    game = false;
                    System.out.println(players[i].name + " wins!");
                }
            }
        }
        while(game);

        }
    }

