package characterAndLinesCounter;
import java.util.Scanner;

public class CountLinesAndCharacter {

    public void setWordArray(String input){
        String[] word = input.split(" ");
    }

    public static int countCharacters(String input){
        int count = 0;

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != '\n') {
                count++;
            }
        }
        return count;
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
        String[] wordsArray = input.split("\\s+");
        return wordsArray.length;
    }

    public int getcountLines(String input) {
        return countLines(input);
    }

    public int getcountWords(String input) {
        return countWords(input);
    }

    public int getCountCharacters(String input) {
        return countCharacters(input);
    }
}
