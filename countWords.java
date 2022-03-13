import java.io.File;
import java.util.Scanner;

public class countWords {
    public static void main(String[] args) throws Exception
// This "throws Exception" is a required annotation because we create
// a Scanner from a File object. This might raise an error. Those are
// called exceptions in java and you might see later how to handle them
// properly. For now we can be optimistic and assume you will only try to
// open files that exist :)
    {
// args is an array containing all the arguments we feed to the program on
// the command line
//
// If there are no arguments, we simply exit
        if (args.length == 0)
            return;
// Otherwise, we create a file object with the path given as first argument
// of the program
        File file = new File(args[0]);
// We can now create a new Scanner that will read that file using a constructor
        Scanner in = new Scanner(file);
        int counterWords = 0;
//then the Scanner can be used with the same methods we have been using so
//far for the standard input
        while(in.hasNext())
        {
            in.next();
            counterWords++;
        }
        System.out.println(args[0] + " contains " + counterWords + " words");
//closing Scanners built from File objects can be important if you want
//to reopen the file in the same program.
        in.close();
    }
}
