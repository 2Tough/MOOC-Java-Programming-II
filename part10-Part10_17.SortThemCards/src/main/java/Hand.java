
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valentin
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> list;

    public Hand() {
        this.list = new ArrayList();
    }

    public void add(Card card) {
        this.list.add(card);
    }

    public void print() {

        for (Card arg : this.list) {
            if (arg.getValue() > 10) {
                String cardValue = "";
                cardValue = String.valueOf(arg.getValue());
                if (arg.getValue() == 11) {
                    cardValue = "J";
                } else if (arg.getValue() == 12) {
                    cardValue = "Q";
                } else if (arg.getValue() == 13) {
                    cardValue = "K";
                } else if (arg.getValue() == 14) {
                    cardValue = "A";
                }
                System.out.println(arg.getSuit() + " " + cardValue);
            } else {
                int cardValue = arg.getValue();
                System.out.println(arg.getSuit() + " " + cardValue);
            }

        }
        // this.list.stream().forEach(arg -> System.out.println(arg.getSuit() + " " + arg.getValue()));
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(this.list, comparator);
        //Collections.sort(this.list, (card1, card2) -> card1.getValue() - card2.getValue()) ;

        for (Card items : this.list) {
            System.out.println(items);
        }
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        
        Collections.sort(this.list, comparator);
        
        //Collections.sort(this.list, (p1, p2) -> p1.getSuit().ordinal() - p2.getSuit().ordinal());
        //this.list.stream().sorted((p1, p2) -> p2.getSuit().ordinal() - p1.getSuit().ordinal());
    }

    @Override
    public int compareTo(Hand hand) {
        int firstHandSum = 0;
        int secondHandSum = 0;
        
        for (Card values : this.list) {
            firstHandSum += values.getValue();
        }
        
        for (Card values : hand.list) {
            secondHandSum += values.getValue();
        }
        
        
        return firstHandSum - secondHandSum;
    }
}
