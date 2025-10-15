import java.util.Optional;

/**
 * A code-breaking game where the app selects a sequence of symbols, and
 * the player tries to guess the sequence within a fixed number of attempts.
 *
 * Feedback for each guess indicates how many values are correct and in
 * the correct position and how many are correct but in the wrong position.
 *
 * Consider using arrays or strings to store and compare codes.
 * @version 1
 */
class MasterMindGame implements Game {
    @Override
    public String getName() {
        return "MasterMind";
    }

    @Override
    public Optional<Integer> play() {
        System.out.println("Welcome to Mastermind"
                + "\nThe goal is to guess the Code Maker mind, "
                + "\nTIn the fewest attempts."
                + "\nTEach attempt the Code Maker will provide hints,"
                + "\nTTo get you one step closer to brake the CODE!");
        return Optional.empty();
    }
}
