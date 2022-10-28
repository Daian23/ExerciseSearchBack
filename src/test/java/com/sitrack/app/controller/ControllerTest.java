package com.sitrack.app.controller;

import com.sitrack.app.model.ModelPhrase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void testValidateURLTrue() {
        boolean expected = true;
        boolean actual = Controller.validateURL("https://es.wikipedia.org/wiki/Pir%C3%A1mides_de_Egipto");
        assertTrue(actual);
    }

    @Test
    public void testValidateURLFalse() {
        boolean expected = true;
        boolean actual = Controller.validateURL("piramide de egipto");
        assertFalse(actual);
    }

    @Test
    public void testClearStringMinMay() {
        String expected = "bloque de piedra";
        String actual = Controller.clearString("BLoquE de pieDRA");
        assertEquals(expected, actual);
    }

    @Test
    public void testClearStringSymbols() {
        String expected = "bloque de piedra roca";
        String actual = Controller.clearString("bloque (de )piedra/roca");
        assertEquals(expected, actual);
    }

    @Test
    public void testClearStringAccents() {
        String expected = "piramides de egipto";
        String actual = Controller.clearString("pirámides de egipto");
        assertEquals(expected, actual);
    }

    @Test
    public void testCountString() {
        int expected = 1;
        int actual = Controller.countString("bloque de piedra","de");
        assertEquals(expected,actual);
    }

    @Test
    public void testGetWordsInSentence(){
        ModelPhrase modelPhrase = new ModelPhrase();
        modelPhrase.setPhrase("piramides egipcias");

        String expected [] = {"piramides","egipcias"};
        String[] actual = Controller.getWordsInSentence(modelPhrase);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddWordsList(){
        ModelPhrase modelPhrase = new ModelPhrase();

        List<String> expected =  new ArrayList<>();
        expected.add("piramides");
        expected.add("egipcias");

        String[] words = {"piramides","egipcias"};
        Controller.addWordsList(words,modelPhrase);

        List<String> actual= modelPhrase.getPhraseWords();

        assertEquals(expected,actual);
    }

    @Test
    public void testAddWordsAmountList(){

        ModelPhrase modelPhrase = new ModelPhrase();

        List<Integer> expected =  new ArrayList<>();
        expected.add(2);

        String[] words = {"de"};

        String bodyHTML = "bloques de piedra de egipto";

        Controller.addWordsAmountList(words,bodyHTML,modelPhrase);

        List<Integer> actual = modelPhrase.getPhraseWordsAmount();

        assertEquals(expected,actual);

    }

}