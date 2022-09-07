package com.joshuacrotts.quine.utils;

public class QuineUtils {

    public static int sbCompareTo(StringBuilder _s1, StringBuilder _s2) {
        if (_s1.length() > _s2.length()) return 1;
        else if (_s1.length() < _s2.length()) return -1;
        else {
            for (int i = 0; i < _s1.length(); i++) {
                if (_s1.charAt(i) < _s2.charAt(i))
                    return -1;
                else if (_s1.charAt(i) > _s2.charAt(i))
                    return 1;
            }

            return 0;
        }
    }
}
