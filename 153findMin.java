package binarysearch830;

/**
 * Created by xiaochen on 8/30/17.
 */
public class findMin153 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        //left is the mininum
        if (nums[left] < nums[right]) return nums[left];

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle > 0 && nums[middle - 1] > nums[middle])
                return nums[middle];
            else if (nums[middle] > nums[right])
                left = middle + 1;
            else
                right = middle - 1;
        }
        return nums[left];
    }
}
