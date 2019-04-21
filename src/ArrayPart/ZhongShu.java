package ArrayPart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ZhongShu {
    public static void Zhongshu() {
        Map<Integer,Integer> le = new HashMap();
        Scanner in = new Scanner(System.in);
        String x = in.next();
        x = x.substring(1, x.length() - 1);
        System.out.println(x);
        int[] shuzu = new int[x.length() / 2 + 1];
        for (int i = 0; i < shuzu.length; ++i) {
            shuzu[i] = Integer.parseInt(x.charAt(i * 2) + "");
            if (!le.containsKey(shuzu[i])) {
                le.put(shuzu[i], 1);
            } else {
                le.put(shuzu[i], le.get(shuzu[i]) + 1);
            }
        }
        int max_key = 0, max_value = 0;
        Iterator<Map.Entry<Integer, Integer>> it = le.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey()+" -- "+entry.getValue());
            if (entry.getValue() > max_value) {
                max_value = entry.getValue();
                max_key = entry.getKey();
            }
        }
        System.out.println(max_key);
    }
}
