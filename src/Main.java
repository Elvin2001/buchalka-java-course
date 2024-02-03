public class Main {
    public static void main(String[] args) {
        int firstResult = calculateScore("Elvin", true, 800, 5, 200);
        int secondResult = calculateScore("Vladimir", false, 302, 210, 211);
    }

    public static int calculateScore(String name, boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = 0;

        if (gameOver) {
            finalScore = getScore(score, levelCompleted, bonus);
            int highScorePosition = calculateHighScorePosition(finalScore);
            displayHighScorePosition(name, highScorePosition);
            showScore(finalScore);
            return finalScore;
        }

        System.out.printf("%s haven't any score..", name);
        return -1;
    }

    private static int getScore(int score, int levelCompleted, int bonus) {
        int finalScore;
        finalScore = score + (levelCompleted * bonus);
        return finalScore;
    }

    private static void showScore(int finalScore) {
        System.out.println("Your final score = " + finalScore);
    }

    public static void showResults(int firstResult, int secondResult) {
        System.out.printf("First result = %d, second result = %d", firstResult, secondResult);
    }

    public static void displayHighScorePosition(String participantName, int position) {
        System.out.printf("%s managed to get into position and the position is = %d", participantName, position);
        System.out.println();
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1500;
        } else if (score > 500 && score < 1000) {
            return 900;
        } else if (score > 100 && score < 500) {
            return 400;
        } else {
            return 900;
        }
    }
}