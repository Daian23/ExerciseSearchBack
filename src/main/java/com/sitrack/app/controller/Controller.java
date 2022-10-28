package com.sitrack.app.controller;

import com.sitrack.app.model.ModelPhrase;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import com.sitrack.app.view.View;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.Normalizer;

public class Controller {
    public static void init() throws Exception {

        View view = new View();
        ModelPhrase modelPhrase = new ModelPhrase();

        String urlInput = view.requestUrl();

        if (validateURL(urlInput)) {

            String bodyHTML = connectUrl(urlInput);

            String clearBodyHTML = clearString(bodyHTML);

            String phrase = view.requestPhrase();
            validatePhrase(phrase);
            modelPhrase.setPhrase(clearString(phrase));

            int countPhrase = countString(clearBodyHTML, modelPhrase.getPhrase());
            modelPhrase.setAmountOfPhrase(countPhrase);

            String[] words = getWordsInSentence(modelPhrase);

            addWordsList(words, modelPhrase);
            addWordsAmountList(words, clearBodyHTML, modelPhrase);

            view.resultSearch(modelPhrase);
        }
    }

    public static void validatePhrase(String phrase) throws Exception {
        if (phrase == null || phrase.isEmpty()) {
            throw new Exception("La frase no puede ser nula o vacía");
        }
    }

    public static String clearString(String text) {
        String lowerCaseText = text.toLowerCase();

        String clearTextSymbols = lowerCaseText.replaceAll("[\\-\\+\\«\\»\\{\\}\\(\\¡\\!\\¿\\?\\)\\,\\:\\.\\^,]", "");
        clearTextSymbols = clearTextSymbols.replace("[", "").replace("]", "");
        clearTextSymbols = clearTextSymbols.replaceAll("/", " ");

        String clearTextNormalize = Normalizer.normalize(clearTextSymbols, Normalizer.Form.NFD);
        String clearText = clearTextNormalize.replaceAll("[^\\p{ASCII}]", "");

        return clearText;
    }

    public static boolean validateURL(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (MalformedURLException e) {
            System.out.println("URL mal formada");
            return false;
        } catch (URISyntaxException e) {
            System.out.println("Error sintaxis URL");
            return false;
        }
    }

    public static String connectUrl(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.text();
    }

    public static int countString(String clearBodyHTML, String phrase) {
        int count = 0;
        for (int i = 0; i < clearBodyHTML.length(); i++) {

            if (clearBodyHTML.substring(i).startsWith(" " + phrase + " ")) {

                count++;
            }
        }
        return count;
    }

    public static String[] getWordsInSentence(ModelPhrase modelPhrase) {
        return modelPhrase.getPhrase().split(" ");
    }

    public static void addWordsList(String words[], ModelPhrase modelPhrase) {
        for (String word : words) {
            modelPhrase.setPhraseWords(word);
        }
    }

    public static void addWordsAmountList(String words[], String bodyHTML, ModelPhrase modelPhrase) {
        for (String word : words) {
            Integer counterWord = countString(bodyHTML, word);
            modelPhrase.setPhraseWordsAmount(counterWord);
        }
    }
}
