package characterAndLinesCounter;
import java.util.Scanner;

public class CountLinesAndCharacter {
        //Jag har ingen egen konstruktor, borde jag ha haft det???
    public void setWordArray(String input){
        String[] word = input.split(" "); //Variabeln word används inte, men jag vet
        //inte hur jag kan ta bort den utan att allt blev knas.
    }

    public static int countCharacters(String input){
        int count = 0;

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != '\n') { //om tecknet INTE är samma som newline tecknet
                // så fortsätter loopen
                count++;
            }
        }
        return count;  //Den funkar så länge man inte trycker space efter sin mening,
        // för då lägger den till det som ett tecken
    }
    public int countLines(String input) {
        Scanner scanner = new Scanner(input);
        int lineCount = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            lineCount++;
        }
        return lineCount;
    }

    public int countWords(String input){
        String[] wordsArray = input.split("\\s+"); //splittar upp inputarrayn i ord, vid en eller flera mellanslag
        return wordsArray.length;
    }

    //Metoder för att förenkla testerna framförallt
    public int getCountLines(String input) {
        return countLines(input);
    }

    public int getCountWords(String input) {
        return countWords(input);
    }

    public int getCountCharacters(String input) {
        return countCharacters(input);
    }
}
