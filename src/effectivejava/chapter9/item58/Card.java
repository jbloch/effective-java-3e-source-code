package effectivejava.chapter9.item58;

import java.util.*;

public class Card {
    private final Suit suit;
    private final Rank rank;

    // Can you spot the bug?
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    Card(Suit suit, Rank rank ) {
        this.suit = suit;
        this.rank = rank;
    }

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        
        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
                deck.add(new Card(i.next(), j.next()));

//        // Preferred idiom for nested iteration on collections and arrays
//        for (Suit suit : suits)
//            for (Rank rank : ranks)
//                deck.add(new Card(suit, rank));
    }
}
