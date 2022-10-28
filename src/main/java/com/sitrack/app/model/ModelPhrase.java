package com.sitrack.app.model;
import java.util.ArrayList;
import java.util.List;
public class ModelPhrase {
    String phrase;
    int amountOfPhrase;

    public static List<String> phraseWords = new ArrayList<>();
    public static List<Integer> phraseWordsAmount = new ArrayList<>();

    public ModelPhrase() {
        //Default Constructor
    }

    public ModelPhrase(String phrase, int amountOfPhrase, List<String> phraseWords, List<Integer> phraseWordsAmount) {
        this.phrase = phrase;
        this.amountOfPhrase = amountOfPhrase;
        this.phraseWords = phraseWords;
        this.phraseWordsAmount = phraseWordsAmount;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getAmountOfPhrase() {
        return amountOfPhrase;
    }

    public void setAmountOfPhrase(int amountOfPhrase) {
        this.amountOfPhrase = amountOfPhrase;
    }

    public List<String> getPhraseWords() {
        return phraseWords;
    }

    public void setPhraseWords(String phraseWords) {
        this.phraseWords.add(phraseWords);
    }

    public List<Integer> getPhraseWordsAmount() {
        return phraseWordsAmount;
    }

    public void setPhraseWordsAmount(Integer phraseWordsAmount) {
        this.phraseWordsAmount.add(phraseWordsAmount);
    }
}
