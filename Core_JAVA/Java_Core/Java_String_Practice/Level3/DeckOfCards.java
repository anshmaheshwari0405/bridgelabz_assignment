import java.util.Scanner;
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int players = sc.nextInt();
        String[] deck = initDeck();
        shuffle(deck);
        String[][] hands = distribute(deck,n,players);
        for(int i=0;i<players;i++) {
            System.out.println("Player " + (i+1));
            for(String c: hands[i]) System.out.println(c);
        }
        sc.close();
    }
    static String[] initDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx=0;
        for(String r: ranks) for(String s: suits) deck[idx++]= r + " of " + s;
        return deck;
    }
    static void shuffle(String[] deck) {
        int n = deck.length;
        for(int i=0;i<n;i++) {
            int r = i + (int)(Math.random()*(n-i));
            String t = deck[i];
            deck[i]=deck[r];
            deck[r]=t;
        }
    }
    static String[][] distribute(String[] deck,int n,int players) {
        if(n % players != 0) n = (n / players) * players;
        int per = n / players;
        String[][] hands = new String[players][per];
        int idx=0;
        for(int i=0;i<players;i++) for(int j=0;j<per;j++) hands[i][j]=deck[idx++];
        return hands;
    }
}
