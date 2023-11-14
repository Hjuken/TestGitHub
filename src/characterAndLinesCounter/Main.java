package characterAndLinesCounter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic countLinesAndCharacter = new Logic();

        String savedStrings = "";
        int characterCount = 0;
        int lineCount = 0;
        String input;

        System.out.println("Write your text, to end text write: Stop");

        while (true) {
            input = scan.nextLine();
            String lowerCaseInput = input.toLowerCase();
            if (!lowerCaseInput.equals("stop")) {
                savedStrings += input + "\n";

                characterCount = Logic.countCharacters(savedStrings);
                lineCount = countLinesAndCharacter.countLines(savedStrings);

            } else {
                countLinesAndCharacter.setWordArray(savedStrings.trim());
                break;
            }

        }
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of lines: " + lineCount);


    }

}
