import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Wordle {
    static ArrayList<String> words = new ArrayList<>();
    public static void main(String[] args){

        // Getting the list of words from dictionary
        File dictionaryPath = new File(args[0]);

//        Using try catch block to catch tha error
        try (Scanner sc = new Scanner(dictionaryPath)) {

            while (sc.hasNext()) {
                words.add(sc.next());
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        WordleInput.wordsCompare(Wordle1.randomWord);
    }
}
