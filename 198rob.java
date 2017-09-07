package random825;

/**
 * Created by xiaochen on 8/25/17.
 */
public class rob198 {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] dp = new int[2];
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = dp[0];
            dp[0] = Math.max(dp[0], dp[1]);
            dp[1] = temp + nums[i];
        }
        return Math.max(dp[0], dp[1]);
    }
}
