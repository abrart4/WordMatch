public class Main {
    public static void main(String[] args) {
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
    }
}
