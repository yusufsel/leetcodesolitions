package ysf.solituon;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        return alt(text1.toCharArray(), text2.toCharArray(), 0, 0, new HashMap<>());
    }

    private int alt(char[] str1, char[] str2, int indx1, int indx2, Map<String, Integer> memo) {
        String key = indx1 + "_" + indx2;
        if (memo.containsKey(key)) return memo.get(key);

        if (indx1 >= str1.length || indx2 >= str2.length) return 0;

        int case1 = 0, case2 = 0, case3 = 0;

        if (str1[indx1] == str2[indx2]) {
            case1 = alt(str1, str2, indx1 + 1, indx2 + 1, memo) + 1;
        } else {
            case2 = alt(str1, str2, indx1 + 1, indx2, memo);
            case3 = alt(str1, str2, indx1, indx2 + 1, memo);
        }

        memo.put(key, Math.max(case1, Math.max(case2, case3)));
        return memo.get(key);
    }


}
