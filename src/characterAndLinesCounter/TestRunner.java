package characterAndLinesCounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestRunner {

    @Test
    public void testCountCharacters(){
        //Arrange
        CountLinesAndCharacter counter = new CountLinesAndCharacter();
        String input = "Hej Adam och Staffan! Hur mår ni?";
        int expected = 33;
        //Act
        int actual = counter.getCountCharacters(input);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCountLines(){
        //Arrange
        CountLinesAndCharacter counter = new CountLinesAndCharacter();
        String input = " Hej \n igen \n Adam \n och \n Staffan!";
        int expected = 5;
        //Act
        int actual = counter.getcountLines(input);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCountWords(){
        //Arrange
        CountLinesAndCharacter counter = new CountLinesAndCharacter();
        String input = "Hur är det med ögat Adam?";
        int expected = 6;
        //Act
        int actual = counter.getcountWords(input);
        //Assert
        assertEquals(expected,actual);
    }

}
