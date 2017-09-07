package random825;

/**
 * Created by xiaochen on 8/25/17.
 */
public class rob213 {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        return Math.max(canrob(nums, 0, nums.length - 2), canrob(nums, 1, nums.length - 1));
    }

    public int canrob(int[] nums, int start, int end) {
        int rob = 0, nrob = 0;
        for (int i = start; i <= end; i++) {
            int temp = rob;
            rob = nrob + nums[i];
            nrob = Math.max(nrob, temp);
        }
        return Math.max(rob, nrob);
    }
}
