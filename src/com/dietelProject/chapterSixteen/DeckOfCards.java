package com.dietelProject.chapterSixteen;

import com.dietelProject.chapterSeven.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<Card> cards;

    public DeckOfCards(){
        Card[] deck = new Card[52];
        int count = 0;

        for(Card.Suit suit : Card.Suit.values()){
            for(Card.Face face : Card.Face.values()){
                deck[count] = new Card(face, suit);
                count++;
            }
        }

        cards = Arrays.asList(deck);
        Collections.shuffle(cards);
    }


    public void printCards(){
        for (int i = 0; i < cards.size(); i++){
            System.out.printf("%-19s%s", cards.get(i), ((i + 1) % 4 == 0) ? System.lineSeparator() : " ");
        }
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.printCards();
    }

}
