package random825;

/**
 * Created by xiaochen on 8/25/17.
 */
public class numWays276 {
    public int numWays(int n, int k) {
        if (n == 0)
            return 0;
        if (n == 1)
            return k;
        int samelastwo = k;
        int diflastwo = k * (k - 1);
        for (int i = 2; i < n; i++) {
            int temp = diflastwo;
            diflastwo = (samelastwo + diflastwo) * (k - 1);
            samelastwo = temp;
        }
        return diflastwo + samelastwo;
    }
}
