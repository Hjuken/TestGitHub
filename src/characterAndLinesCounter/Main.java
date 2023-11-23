package characterAndLinesCounter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //läser in input från användaren

        //Här skapar jag objektet 'countLinesAndCharacter'
        CountLinesAndCharacter countLinesAndCharacter = new CountLinesAndCharacter();

        String savedStrings = "";
        int characterCount = 0;
        int lineCount = 0;
        int wordCount = 0;
        String input;

        System.out.println("Write your text, to end text write: Stop");

        //
        while (true) {
            input = scan.nextLine();
            String lowerCaseInput = input.toLowerCase(); //konverterar all input till små bokstäver
            if (!lowerCaseInput.equals("stop")) {
                savedStrings += input + "\n"; //savedStrings = savedStrings + input + radbrytning

                
                characterCount = CountLinesAndCharacter.countCharacters(savedStrings.trim());
                lineCount = countLinesAndCharacter.countLines(savedStrings);
                wordCount = countLinesAndCharacter.countWords(savedStrings);

            } else {
                countLinesAndCharacter.setWordArray(savedStrings.trim());
                break;
            }
        }
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);

    }
}
