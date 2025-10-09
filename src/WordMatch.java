import java.util.Objects;

public class WordMatch {
    /** The secret string. */
    private String secret;

    /**
     * Length of the secret word.
     * @author Abrar
     **/
    private int secretLength;

    /** Constructs a WordMatch object with the given secret string of lowercase lettes. */
    public WordMatch(String word) {
        this.secret = word;
        this.secretLength = word.length();
    }

    /** Returns a score for guess, as described in part (a).
     *  Precondition: 0 < guess.length() <= secret.length()
     */
    public int scoreGuess(String guess) {
        int score = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i ++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                score ++;
            }
        }
        return score * guess.length() * guess.length();
    }

    /** Returns the better of two guesses, as determined by scoreGuess and the rules for a
     * tie-breaker that are described in part (b).
     * Precondition: guess1 and guess2 contain all lowercase letters.
     *               guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2) {
        return null;
    }
}
