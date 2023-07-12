package ysf.solituon;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WordBreak {


    public boolean wordBreak(String s, List<String> wordDict) {

        List<String> containedWords = wordDict.stream().filter(s1 -> s.contains(s1)).sorted((o1, o2) -> o1.length() > o2.length() ? -1 : 0).collect(Collectors.toList());

        return wordBreakInner(s, containedWords, "", new HashSet<>());
    }

    public boolean wordBreakInner(String s, List<String> wordDict, String controlStr, Set<String> controlledStrings) {
        if (s.isEmpty()) return true;
        for (String word : wordDict) {
            if (s.endsWith(word) && !controlledStrings.contains(word + controlStr)) {
                controlledStrings.add(word + controlStr);
                if (wordBreakInner(s.substring(0, s.length() - word.length()), wordDict, word + controlStr, controlledStrings))
                    return true;
            }
        }
        return false;
    }


}
