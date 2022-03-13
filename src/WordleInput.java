import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordleInput {
    /*This method takes the input word from user*/
    public static String userInputWord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the Word");
        return sc.nextLine();

    }
    /*This method compares the user input word to guessed word by computer from dictionary*/
    public static void wordsCompare(String answer) {
        String guessWord = userInputWord();
        String oldWord = null;

        int Attempt = 1;
        while (true) {
            if (Wordle.words.contains(guessWord)) {
                String[] str = answer.split("");
                ArrayList<String> listOfLetters = new ArrayList<>(Arrays.asList(str));
//                You can see answer by uncommenting it
//                System.out.println(answer);
                while (!guessWord.equalsIgnoreCase(answer)) {
                    String[] guessLetters = guessWord.split("");
                    for (int i = 0; i < answer.length(); i++) {
                        if (listOfLetters.get(i).equalsIgnoreCase(guessLetters[i])) {
                            System.out.print(Colors.GREEN_BRIGHT + guessLetters[i] + Colors.RESET);
                        } else if (listOfLetters.contains(guessLetters[i])) {
                            System.out.print(Colors.YELLOW_BRIGHT + guessLetters[i] + Colors.RESET);
                        } else {
                            System.out.print(Colors.RED_BRIGHT + guessLetters[i] + Colors.RESET);
                        }

                    }
                    System.out.println("\n");
                    Attempt += 1;
                    oldWord = guessWord;
                    guessWord = userInputWord();
                    if (!Wordle.words.contains(guessWord)) {
                        break;
                    }

                }

            }
            if (guessWord.equalsIgnoreCase("help")) {
                System.out.println(Wordle1.help());
                guessWord = userInputWord();
            } else if (guessWord.equalsIgnoreCase("hint")) {
                System.out.println("This letter is there in answer word");
                System.out.println(Wordle1.hint());
                guessWord = userInputWord();
            } else if (guessWord.equalsIgnoreCase("giveUp")) {
                Wordle1.giveUp();
            } else if (guessWord.equalsIgnoreCase("info")) {
                String[] answerWordArray = answer.split("");
                ArrayList<String> answerWordList = new ArrayList<>(Arrays.asList(answerWordArray));
                ArrayList<String> firstTypeLetter = new ArrayList<>();
                ArrayList<String> secondTypeLetter = new ArrayList<>();
                ArrayList<String> thirdTypeLetter = new ArrayList<>();
                String[] breakWord = oldWord.split("");

                for (int i = 0; i < 5; i++) {
                    if (answerWordList.get(i).equals(breakWord[i])) {
                        firstTypeLetter.add(breakWord[i]);
                    } else if (!answerWordList.get(i).equals(breakWord[i]) && answerWordList.contains(breakWord[i])) {
                        secondTypeLetter.add(breakWord[i]);
                    } else {
                        thirdTypeLetter.add(breakWord[i]);
                    }
                }
                System.out.println("These letters are at right position in answer word" + firstTypeLetter);
                System.out.println("These letters are present in word but not at right position" + secondTypeLetter);
                System.out.println("These letters are not present in answer word" + thirdTypeLetter);
                guessWord = userInputWord();
            }
            else if(answer.equalsIgnoreCase(guessWord)){
                break;
            }
        }
        if(guessWord.equalsIgnoreCase(answer)){
            System.out.printf("Congratulations you have guessed the word correctly in %d tries", Attempt);
            System.out.println(Colors.Rainbow("\nI am so proud of You"));

        }


    }

}
