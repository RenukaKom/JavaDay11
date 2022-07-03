package com.bridgelabz.oops;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] arr = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        DeckOfCards card = new DeckOfCards();
        card.haveSuit(suit);
        card.hasRank(arr);
        card.shuffleRank(arr);
        card.shuffleSuit(suit);
    }
    public void haveSuit(String[] suit){
        System.out.print("This is original sequence of Suits: ");
        for (int i = 0; i < suit.length; i++) {
            System.out.print(suit[i] + "\t");
        } System.out.println();
    }
    public void hasRank(String[] arr) {
        System.out.print("This is original sequence of Rank: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + "\t");
        } System.out.println();
    }
    public void shuffleSuit(String[] suit){
        Random rand = new Random();
        for (int i = 0; i < suit.length; i++){
            int swap = rand.nextInt(suit.length);
            String temp = suit[swap];
            suit[swap] = suit[i];
            suit[i] = temp;
        }
        System.out.println("This sequence is after shuffle of suits:  " + Arrays.toString(suit));
    }
    public void shuffleRank(String[] arr){
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            int swap = rand.nextInt(arr.length);
            String temp = arr[swap];
            arr[swap] = arr[i];
            arr[i] = temp;

        }
        System.out.println("This sequence is after shuffle of rank:  " + Arrays.toString(arr));
    }
}