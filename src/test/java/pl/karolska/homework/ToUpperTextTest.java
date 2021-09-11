package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperTextTest {


        @Test
        void shouldMakeLettersUpperCase() {

            ToUpperText ToUpperText = new ToUpperText();


            String text = "Ordinary Letters";


            String result = ToUpperText.formatText(text);


            Assertions.assertEquals("ORDINARY LETTERS", result);

        }

        @Test
        void shouldMakeAllLettersUpperCase() {

            ToUpperText ToUpperText = new ToUpperText();


            String text = "OrDiNary leTteRs";


            String result = ToUpperText.formatText(text);


            Assertions.assertEquals("ORDINARY LETTERS", result);

        }

        @Test
        void shouldNotChangeAnything() {

            ToUpperText ToUpperText = new ToUpperText();


            String text = "ORDINARY LETTERS";


            String result = ToUpperText.formatText(text);


            Assertions.assertEquals("ORDINARY LETTERS", result);

        }

    }