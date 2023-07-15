package ysf.solituon.dynamic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SharedSubString {
    public String getSharedSubStringThatHasMaxLenght(String str1, String str2) {

        Map<Character, Set<Integer>> charsLocationInStr1 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            charsLocationInStr1.computeIfAbsent(str1.charAt(i), aByte -> new HashSet<>()).add(i);
        }

        String rt = "";
        final StringBuilder longestSubString = new StringBuilder();
        Set<Integer> lastCheckedIndexs = null;


        for (int i = 0; i < str2.length(); i++) {
            if (lastCheckedIndexs == null)
                lastCheckedIndexs = charsLocationInStr1.get(str2.charAt(i));
            else
                lastCheckedIndexs = trackedIndexs(lastCheckedIndexs, charsLocationInStr1.get(str2.charAt(i)));

            if (lastCheckedIndexs == null) {
                if (longestSubString.length() > rt.length()) {
                    rt = longestSubString.toString();
                }
                longestSubString.setLength(0);
                lastCheckedIndexs = charsLocationInStr1.get(str2.charAt(i));
                if (lastCheckedIndexs != null)
                    longestSubString.append(str2.charAt(i));
            } else {
                longestSubString.append(str2.charAt(i));
            }
        }

        if (longestSubString.length() > rt.length()) {
            rt = longestSubString.toString();
            longestSubString.setLength(0);
        }


        return rt;
    }

    private Set<Integer> trackedIndexs(Set<Integer> lastWatchedIndexs, Set<Integer> currentIndexs) {
        if (currentIndexs == null) return null;

        final Set<Integer> rt = new HashSet<>();

        lastWatchedIndexs.stream().forEach(integer -> {
            int seek = integer + 1;
            if (currentIndexs.contains(seek)) {
                rt.add(seek);
            }
        });

        return rt.isEmpty() ? null : rt;
    }
}
