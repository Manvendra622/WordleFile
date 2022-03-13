##Wordle.java File
This file contains main method in which we take [dic.txt]() file as argument[0].
By using try, catch block we store that dic.txt file in arrayList [Wordle](D:\Wordle\WordlefIle\src\Wordle.java).
Then we fetch a random word from that dictionary. Further by passing that random word as an argument in [wordsComapre()](D:\Wordle\WordlefIle\src\WordleInput.java) method present in [WordleInput.java](D:\Wordle\WordlefIle\src\WordleInput.java) file.
##WordleInput.java File
WordleInput file contains two methods:-
1. [userInputWord()](D:\Wordle\WordlefIle\src\WordleInput.java)
2. [wordsCompare()](D:\Wordle\WordlefIle\src\WordleInput.java)

userInputWord() method takes the input from user.
And wordsCompare() method compares the user inputed word to random generated word from custom dictionary file.

As well as this file contains the conditional statement to check whether user inputs the word [info](D:\Wordle\WordlefIle\src\WordleInput.java), [help](D:\Wordle\WordlefIle\src\WordleInput.java), [giveup](D:\Wordle\WordlefIle\src\WordleInput.java) or [hint](D:\Wordle\WordlefIle\src\WordleInput.java).

##Wordle1 File
This file contains two methods:-
1. [randNumberGenerate](D:\Wordle\WordlefIle\src\Wordle1.java) which generates a random number by passing the limit in argument. So this generates a random number within the limit.
2. [randStringGenerate](D:\Wordle\WordlefIle\src\Wordle1.java)
 which generates a random String with help of randNumberGenerate method.

And as well as it contains three methods:-
1. [help()](D:\Wordle\WordlefIle\src\Wordle1.java)
2. [hint()](D:\Wordle\WordlefIle\src\Wordle1.java)
3. [giveUp()](D:\Wordle\WordlefIle\src\Wordle1.java)