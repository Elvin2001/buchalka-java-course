public class Main {
    public static void main(String[] args) {
        int firstResult = calculateScore(true, 800, 5, 200);
        int secondResult = calculateScore(false, 302, 210, 211);
        showResults(firstResult, secondResult);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = 0;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score = " + finalScore);
        }
        return finalScore;
    }

    public static void showResults(int firstResult, int secondResult) {
        System.out.printf("First result = %d, second result = %d", firstResult, secondResult);
    }
}