package random827;

/**
 * Created by xiaochen on 8/27/17.
 */
public class MovingAverage {
    int[] store;
    double sum;
    int count;
    int index;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        sum = 0;
        count = 0;
        index = 0;
        store = new int[size];
    }

    public double next(int val) {
        if (count < store.length) count++;
        sum -= store[index];
        sum += val;
        store[index++] = val;
        index = index % store.length;
        return sum / count;
    }
}
