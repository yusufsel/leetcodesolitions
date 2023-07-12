package ysf.solituon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodeWays {
    public int numDecodings(String s) {
        List<String> codes = new ArrayList<>();
        for (int i = 1; i <= 26; i++) codes.add(String.valueOf(i));
        Map<String, Integer> memo = new HashMap<>();
        return numDecodingsInner(s, codes, memo);
    }


    private int numDecodingsInner(String s, List<String> codes, Map<String, Integer> memo) {

        if (memo.containsKey(s)) return memo.get(s);

        if (s.length() == 0) {
            return 1;
        }


        int rt = 0;

        if (codes.contains(s.substring(0, 1)))
            rt += numDecodingsInner(s.substring(1), codes, memo);
        if (s.length() > 1 && codes.contains(s.substring(0, 2)))
            rt += numDecodingsInner(s.substring(2), codes, memo);


        memo.put(s, rt);
        return rt;

    }
}
