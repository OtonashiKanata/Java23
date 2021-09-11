package pl.karolska.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerTextTest {

    @Test
    void shouldMakeLettersLowerCase() {

        ToLowerText ToLowerText = new ToLowerText();


        String text = "Ordinary Letters";


        String result = ToLowerText.formatText(text);


        Assertions.assertEquals("ordinary letters", result);

    }

    @Test
    void shouldMakeAllLettersLowerCase() {

        ToLowerText ToLowerText = new ToLowerText();


        String text = "OrDiNary leTteRs";


        String result = ToLowerText.formatText(text);


        Assertions.assertEquals("ordinary letters", result);

    }

        @Test
        void shouldNotChangeAnything() {

            ToLowerText ToLowerText = new ToLowerText();


            String text = "ordinary letters";


            String result = ToLowerText.formatText(text);


            Assertions.assertEquals("ordinary letters", result);

        }

}