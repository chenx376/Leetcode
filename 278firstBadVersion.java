package random827;

/**
 * Created by xiaochen on 8/27/17.
 */
public class firstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (isBadVersion(middle)) {
                if (middle == 1 || !isBadVersion(middle - 1))
                    return middle;
                else
                    high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public boolean isBadVersion(int n) {
        return true;
    }
}
