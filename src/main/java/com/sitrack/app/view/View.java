package com.sitrack.app.view;

import com.sitrack.app.controller.Controller;
import com.sitrack.app.model.ModelPhrase;

import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);
    Controller search = new Controller();

    public String requestUrl() {
        System.out.println("Ingrese URL");
        return input.nextLine();
    }

    public String requestPhrase() {
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese frase a buscar");
        return input.nextLine().trim();
    }

    public void resultSearch(ModelPhrase modelPhrase) {
        System.out.println("----------------RESULTADO-------------------");
        System.out.println("Frase: " + modelPhrase.getPhrase());
        System.out.println("Aparece: " + modelPhrase.getAmountOfPhrase());
        System.out.println("--------------------------------------------");

        int sizeList = modelPhrase.getPhraseWords().size();

        for (int i = 0; i < sizeList; i++) {
            System.out.println(modelPhrase.phraseWords.get(i) + " --> " + modelPhrase.phraseWordsAmount.get(i));
        }

        System.out.println("--------------------------------------------");
    }
}
