package com.dcy;

/**
 * @author Kyle
 * @date 2023/10/25
 *
 * 58. 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 * 示例 1：
 * 输入：s = "Hello World"
 * 输出：5
 * 解释：最后一个单词是“World”，长度为5。
 *
 * 示例 2：
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * 解释：最后一个单词是“moon”，长度为4。
 *
 * 示例 3：
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 * 解释：最后一个单词是长度为6的“joyboy”。
 */
public class LeetCode58 {
    public static void main(String[] args) {
        //String s = "Hello World";
        String s = "a";
        //String s = "   fly me   to   the moon  ";
        //String s = "luffy is still joyboy";

        //int length = new LeetCode58().lengthOfLastWord1(s);
        //int length = new LeetCode58().lengthOfLastWord2(s);
        int length = new LeetCode58().lengthOfLastWord3(s);
        System.out.println("length = " + length);
    }

    /**
     * 第三种方法：从后往前遍历，统计最后一个单词的长度
     * @param s
     * @return
     */
    public int lengthOfLastWord3(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                if (i != 0 && s.charAt(i-1) == ' ') {
                    break;
                }
            }
        }
        return count;
    }

    /**
     * 第二种方法：使用split分割空格，获取最后一个单词的长度
     * @param s
     * @return
     */
    public int lengthOfLastWord2(String s) {
        String[] split = s.split(" ");

        if (split[split.length - 1].equals(" ")) {
            return split[split.length - 2].length();
        } else {
            return split[split.length - 1].length();
        }
    }

    /**
     * 第一种方法：先使用trim去除前后空格，再使用split分割空格，获取最后一个单词的长度
     * @param s
     * @return
     */
    public int lengthOfLastWord1(String s) {
        String[] split = s.trim().split(" ");
        return split[split.length - 1].length();
    }
}
