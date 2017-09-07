package random827;

/**
 * Created by xiaochen on 8/27/17.
 */
public class getMoneyAmount375 {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        return calculate(dp, 1, n);
    }

    public int calculate(int[][] dp, int start, int end) {
        if (start >= end)
            return 0;
        if (dp[start][end] != 0)
            return dp[start][end];
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            int res = i + Math.max(calculate(dp, i + 1, end), calculate(dp, start, i - 1));
            min = Math.min(min, res);
        }
        dp[start][end] = min;
        return min;
    }
}
