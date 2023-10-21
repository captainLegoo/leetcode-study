package com.dcy;

/**
 * @author Kyle
 * @date 2023/10/20
 *
 * 389. 找不同
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * 示例 1：
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 *
 * 示例 2：
 * 输入：s = "", t = "y"
 * 输出："y"
 */
public class LeetCode389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        //String s = "a";
        //String t = "aa";

        //String s = "";
        //String t = "y";

        char c = new LeetCode389().findTheDifference(s, t);
        System.out.println("c = " + c);
    }

    /**
     * 将字符串 s和t 中每个字符的 ASCII 码的值求和，然后 t的和 减 s的和
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int sChar = 0;
        for (int i = 0; i < s.length(); i++) {
            sChar += s.charAt(i);
        }

        int tChar = 0;
        for (int i = 0; i < t.length(); i++) {
            tChar += t.charAt(i);
        }

        return (char) (tChar - sChar);
    }
}
