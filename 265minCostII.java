package random825;

/**
 * Created by xiaochen on 8/25/17.
 */
public class minCostII265 {
    public int minCostII(int[][] costs) {
        if (costs.length == 0)
            return 0;

        for (int i = 1; i < costs.length; i++) {
            for (int k = 0; k < costs[0].length; k++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < costs[0].length; j++) {
                    if (j == k)
                        continue;
                    min = Math.min(min, costs[i - 1][j]);
                }
                costs[i][k] += min;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < costs[0].length; i++)
            min = Math.min(costs[costs.length - 1][i], min);
        return min;
    }

    public int minCostII2(int[][] costs) {
        if (costs.length == 0)
            return 0;

        int minindex1 = -1, minindex2 = -1;
        for (int i = 0; i < costs.length; i++) {
            int last1 = minindex1, last2 = minindex2;
            minindex1 = -1;
            minindex2 = -1;
            for (int k = 0; k < costs[0].length; k++) {
                costs[i][k] += last1 == -1 ? 0 : costs[i - 1][k] == costs[i - 1][last1] ?  costs[i - 1][last2] : costs[i - 1][last1];

                if (minindex1 < 0 || (costs[i][k] < costs[i][minindex1])) {
                    minindex2 = minindex1;
                    minindex1 = k;
                } else if (minindex2 < 0 || (costs[i][k] < costs[i][minindex2]))
                    minindex2 = k;
            }
        }
        return costs[costs.length - 1][minindex1];
    }
}
