package characterAndLinesCounter;

import java.util.Scanner;

public class Logic {
    private String[] words;

    public void setWordArray(String input){
        words = input.split(" ");
    }

    public int getArrayLength(){
        return words.length;
    }

    public String[] getWordsArray() {
        return words;
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
        scanner.close();
        return lineCount;
    }

}
