package characterAndLinesCounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {


    @Test
    public void testCountCharacters(){
        //Arrange
        String input = "Hej Adam och Staffan! Hur mår ni?";
        int expected = 33;
        //Act
        int actual = Logic.countCharacters(input);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCountLines(){
        //Arrange
        Logic logic = new Logic();
        String input = " Hej \n igen \n Adam \n och \n Staffan!";
        int expected = 5;
        //Act
        int actual = logic.countLines(input);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testGetArrayLength(){
        Logic logic = new Logic();
        int expected = 10;

        logic.setWordArray("Jag försöker absolut inte fjäska, men ni är super! ;)");
        int actual = logic.getArrayLength();

        assertEquals(expected,actual);
    }
}
