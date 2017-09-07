package random825;

/**
 * Created by xiaochen on 8/25/17.
 */
class NumArray {
    int[] store;

    public NumArray(int[] nums) {
        store = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0)
                store[i] = store[i - 1] + nums[i];
            else
                store[i] = nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? store[j] : store[j] - store[i - 1];
    }
}
