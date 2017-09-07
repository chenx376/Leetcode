
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n;
        int middle = low + (high - low) / 2;
        while (guess(middle) != 0) {
            if (guess(middle) > 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
            middle = low + (high - low) / 2;
        }
        return middle;
    }
}