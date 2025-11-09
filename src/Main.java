import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordMatch game;

        game = new WordMatch("mississippi");
        System.out.println(game.scoreGuess("i"));
        System.out.println(game.scoreGuess("iss"));
        System.out.println(game.scoreGuess("issipp"));
        System.out.println(game.scoreGuess("mississippi"));

        game = new WordMatch("aaaabb");
        System.out.println(game.scoreGuess("a"));
        System.out.println(game.scoreGuess("aa"));
        System.out.println(game.scoreGuess("aaa"));
        System.out.println(game.scoreGuess("aabb"));
        System.out.println(game.scoreGuess("c"));

        game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));

        System.out.println(read());
    }

    public static int read() throws FileNotFoundException {
        int totalScore = 0;

        File guessesFile = new File("Guesses.txt");
        Scanner guessesScanner = new Scanner(guessesFile);
        while (guessesScanner.hasNextLine()) {
            String word = guessesScanner.next();
            String firstGuess = guessesScanner.next();
            String secondGuess = guessesScanner.next();

            WordMatch game = new WordMatch(word);
            String betterGuess = game.findBetterGuess(firstGuess, secondGuess);
            int scoreOfBetterGuess = game.scoreGuess(betterGuess);
            totalScore += scoreOfBetterGuess;
            /*
            WordMatch game = new WordMatch(guessesScanner.next());
            totalScore += game.scoreGuess(game.findBetterGuess(guessesScanner.next(), guessesScanner.next()));
            */
        }
        return totalScore;
    }
}
