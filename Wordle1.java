import java.util.Random;

public class Wordle1 {
    static String randomWord=randStringGenerate();
    public static int randNumberGenerate(int limit){
        Random rand = new Random();
        return rand.nextInt(limit);
    }
    public static String randStringGenerate(){
        int dictionaryWordLimit=randNumberGenerate(Wordle.words.size());
        String randomWord=Wordle.words.get(dictionaryWordLimit);
        return randomWord;
    }

    public static String help(){
        String help="In this game you have to enter the 5 lettered word and that would be matched to the random generated word by computer. Also you have to enter the word that has meaning and that must be present in custom dictionary file." +
                "Also you have some commands like info-> to get the information about last word you entered, hint-> To get a random letter from the answer word, giveUp-> If you want to quit the game you can enter this command";
        return help;
    }
    public static String hint(){
        String[] randomStringArray=randStringGenerate().split("");
        int randomNumberForHint=randNumberGenerate(randomStringArray.length);
        return randomStringArray[randomNumberForHint];
    }
    public static void giveUp(){
        System.exit(0);
    }


}
