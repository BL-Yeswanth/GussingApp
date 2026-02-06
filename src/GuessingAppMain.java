import java.util.Random;

public class GuessingAppMain {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 5;
    private static final int MAX_HINTS = 2;

    private int targetNumber;
    private int remainingAttempts;
    private int remainingHints;

    public GuessingAppMain() {
        Random random = new Random();
        this.targetNumber = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
        this.remainingAttempts = MAX_ATTEMPTS;
        this.remainingHints = MAX_HINTS;
    }

    private void displayWelcomeMessage() {
        System.out.println("Welcome to Number Guessing Application");
        System.out.println("Guess a number between " + MIN_RANGE + " and " + MAX_RANGE);
        System.out.println("You have " + MAX_ATTEMPTS + " attempts and " + MAX_HINTS + " hints");
    }

    public static void main(String[] args) {

        GuessingAppMain game = new GuessingAppMain();
        game.displayWelcomeMessage();
    }
}