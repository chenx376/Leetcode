package random827;
import java.util.*;

/**
 * Created by xiaochen on 8/27/17.
 */
public class firstUniqChar387 {
    public int firstUniqChar(String s) {
        int[] map = new int[256];
        Arrays.fill(map, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c] == -2) continue;
            else if (map[c] == -1) map[c] = i;
            else map[c] = -2;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < map.length; i++) {
            if (map[i] >= 0) min = Math.min(min, map[i]);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
