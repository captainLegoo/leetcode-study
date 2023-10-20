package com.dcy;

/**
 * @author Kyle
 * @date 2023/10/19
 *
 * 1768. 交替合并字符串
 * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。
 * 如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
 * 返回 合并后的字符串 。
 *
 * 示例 1：
 * 输入：word1 = "abc", word2 = "pqr"
 * 输出："apbqcr"
 * 解释：字符串合并情况如下所示：
 * word1：  a   b   c
 * word2：    p   q   r
 * 合并后：  a p b q c r
 *
 * 示例 2：
 * 输入：word1 = "ab", word2 = "pqrs"
 * 输出："apbqrs"
 * 解释：注意，word2 比 word1 长，"rs" 需要追加到合并后字符串的末尾。
 * word1：  a   b
 * word2：    p   q   r   s
 * 合并后：  a p b q   r   s
 *
 * 示例 3：
 * 输入：word1 = "abcd", word2 = "pq"
 * 输出："apbqcd"
 * 解释：注意，word1 比 word2 长，"cd" 需要追加到合并后字符串的末尾。
 * word1：  a   b   c   d
 * word2：    p   q
 * 合并后：  a p b q c   d
 */
public class LeetCode1768 {
    public static void main(String[] args) {
        //String word1 = "abc";
        //String word2 = "pqr";

        String word1 = "ab";
        String word2 = "pqrs";

        //String word1 = "abcd";
        //String word2 = "pq";

        String s = new LeetCode1768().mergeAlternately(word1, word2);
        System.out.println("s = " + s);
    }
    public String mergeAlternately(String word1, String word2) {
        String s = new String();
        int word1Index = 0;
        int word2Index = 0;

        while (word1Index < word1.length() && word2Index < word2.length()) {
            s += word1.charAt(word1Index);
            s += word2.charAt(word2Index);
            word1Index++;
            word2Index++;

            if (word1Index == word1.length()) {
                // append word2 to sb
                s += word2.substring(word2Index);
            } else if (word2Index == word2.length()) {
                // append word1 to sb
                s += word1.substring(word1Index);
            }
        }

        return s;
    }
}
