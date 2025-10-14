import java.util.Objects;

public class WordMatch {
    /** The secret string. */
    private String secret;

    /** Constructs a WordMatch object with the given secret string of lowercase letters. */
    public WordMatch(String word) {
        this.secret = word;
    }

    /** Returns a score for guess, as described in part (a).
     *  Precondition: 0 < guess.length() <= secret.length()
     */
    public int scoreGuess(String guess) {
        int occurences = 0;
        int secretLength = secret.length();
        int guessLength = guess.length();
        for (int i = 0; i <= secretLength - guessLength; i ++) {
            String substring = secret.substring(i, i + guessLength);
            if (Objects.equals(substring, guess)) {
                occurences ++;
            }
        }
        return occurences * guessLength * guessLength;

    }

    /** Returns the better of two guesses, as determined by scoreGuess and the rules for a
     * tie-breaker that are described in part (b).
     * Precondition: guess1 and guess2 contain all lowercase letters.
     *               guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2) {
        int scoreOfGuess1 = scoreGuess(guess1);
        int scoreOfGuess2 = scoreGuess(guess2);
        if (scoreOfGuess1 > scoreOfGuess2) {
            return guess1;
        }
        else if (scoreOfGuess2 > scoreOfGuess1) {
            return guess2;
        }
        int comparison = guess1.compareTo(guess2);
        if (comparison > 0) {
            return guess1;
        }
        return guess2;
    }
}
