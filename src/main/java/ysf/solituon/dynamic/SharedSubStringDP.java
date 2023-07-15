package ysf.solituon.dynamic;

import java.util.HashMap;
import java.util.Map;

public class SharedSubStringDP {

    //yusuf sel
    //...^
    //fvsel
    //..^

    Map<String, String> memo = new HashMap<>();

    public String getSharedSubString(String str1, String str2, int index1, int index2) {

        if (index1 >= str1.length() || index2 >= str2.length()) return "";

        String rt = "";

        if (str1.charAt(index1) == str2.charAt(index2)) {
            rt = str1.charAt(index1) + memo.computeIfAbsent((index1 + 1) + "_" + (index2 + 1), s -> getSharedSubString(str1, str2, index1 + 1, index2 + 1));
            //return str1.charAt(index1) + getSharedSubString(str1, str2, index1 + 1, index2 + 1);
        } else {
            rt = memo.computeIfAbsent(index1 + "_" + index2, s -> "");
        }
        return rt;
    }


    public String getSharedSubStringThatHasMaxLenght(String str1, String str2, int index1, int index2) {

        if (index1 >= str1.length() || index2 >= str2.length()) return "";


        String case1 = getSharedSubString(str1, str2, index1, index2);

        String case2 = getSharedSubStringThatHasMaxLenght(str1, str2, index1 + 1, index2);
        String case3 = getSharedSubStringThatHasMaxLenght(str1, str2, index1, index2 + 1);

        return whichHasMaxLength(case1, case2, case3);

    }

    private String whichHasMaxLength(String s1, String s2, String s3) {
        String temp = s1.length() > s2.length() ? s1 : s2;
        return temp.length() > s3.length() ? temp : s3;
    }
}



