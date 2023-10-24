package com.dcy;

/**
 * @author Kyle
 * @date 2023/10/23
 *
 * 459. 重复的子字符串
 * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 *
 * 示例 1:
 * 输入: s = "abab"
 * 输出: true
 *
 * 解释: 可由子串 "ab" 重复两次构成。
 * 示例 2:
 * 输入: s = "aba"
 * 输出: false
 *
 * 示例 3:
 * 输入: s = "abcabcabcabc"
 * 输出: true
 * 解释: 可由子串 "abc" 重复四次构成。 (或子串 "abcabc" 重复两次构成。)
 */
public class LeetCode459 {
    public static void main(String[] args) {
        //String s = "abab";
        //String s = "aba";
        //String s = "abcabcabcabc";
        String s = "abac";
        //String s = "bb";
        //String s = "ababab";

        boolean b = new LeetCode459().repeatedSubstringPattern(s);
        System.out.println("b = " + b);
    }
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
        //if (s.length()%2 != 0) {
        //    return false;
        //}
        //s = s + s;
        //while (s.length() > 1) {
        //    if (s.substring(0, s.length()/2).equals(s.substring(s.length()/2))) {
        //        return true;
        //    } else {
        //        boolean b = repeatedSubstringPattern(s.substring(0, s.length() / 2));
        //        if (!b) {
        //            break;
        //        }
        //    }
        //}
        //return false;
    }
}
