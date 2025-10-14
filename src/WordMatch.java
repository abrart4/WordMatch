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
        /*
            Finding occurences:
            Sample case: "mississippi"
            - "i": 4
            - "iss": 2
            - "issipp": 1
            - "mississippi": 1
         */
        for (int i = 0; i <= secretLength - guessLength; i ++) {
            // mississippi
            // ississippi
            // ssissippi
            // sissippi
            // issippi
            // ssippi
            // sippi
            // ippi
            // ppi
            // pp
            // i

            // so don't do every substring that includes it. if that was the case then occurrences would be 11 which is not right
            // count all the substrings that start with guess
            // if the guess was i then ississippi would be right
            // so substring 0 to guess length (1) equals guess
            // ✅
            // also do not go too far
            // if i is 9 and guess is 3 then that is invalid
            // if i is 9 and guess is 3 there are no more occurrences
            // oh this goes back in the for loop
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
        return null;
    }
}
