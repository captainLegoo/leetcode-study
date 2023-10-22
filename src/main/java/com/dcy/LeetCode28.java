package com.dcy;

/**
 * @author Kyle
 * @date 2023/10/21
 *
 * 28. 找出字符串中第一个匹配项的下标
 * 给你两个字符串 haystack 和 needle ，
 * 请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 * 如果 needle 不是 haystack 的一部分，则返回  -1 。
 *
 * 示例 1：
 * 输入：haystack = "sadbutsad", needle = "sad"
 * 输出：0
 * 解释："sad" 在下标 0 和 6 处匹配。
 * 第一个匹配项的下标是 0 ，所以返回 0 。
 *
 * 示例 2：
 * 输入：haystack = "leetcode", needle = "leeto"
 * 输出：-1
 * 解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
 */
public class LeetCode28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        //String haystack = "leetcode";
        //String needle = "leeto";

        int i = new LeetCode28().strStr(haystack, needle);
        System.out.println("i = " + i);
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
