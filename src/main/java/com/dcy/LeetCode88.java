package com.dcy;

import java.util.Arrays;

/**
 * @author Kyle
 * @date 2023/10/12 17:07
 *
 * 合并两个有序数组
 * - 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * - 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * - 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 *
 * 示例 1：
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 *
 * 示例 2：
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 * 解释：需要合并 [1] 和 [] 。
 * 合并结果是 [1] 。
 *
 * 示例 3：
 * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
 * 输出：[1]
 * 解释：需要合并的数组是 [] 和 [1] 。
 * 合并结果是 [1] 。
 */
public class LeetCode88 {

    public static void main(String[] args) {
        //int[] nums1 = {1};
        //int m = 1;
        //int[] nums2 = {};
        //int n = 0;

        //int[] nums1 = {0};
        //int m = 0;
        //int[] nums2 = {1};
        //int n = 1;

        //int[] nums1 = {2,0};
        //int m = 1;
        //int[] nums2 = {1};
        //int n = 1;

        //int[] nums1 = {4,5,6,0,0,0};
        //int m = 3;
        //int[] nums2 = {1,2,3};
        //int n = 3;

        int[] nums1 = {0, 0, 3, 0, 0, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {-1, 1, 1, 1, 2, 3};
        int n = 6;

        // 双指针
        new LeetCode88().merge1(nums1, m, nums2, n);
        // 先合并，再排序
        //new LeetCode88().merge2(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 先合并，再排序
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }

    /**
     * 双指针
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        // 定义num1的指针
        int nums1Index = 0;
        // 定义num2的指针
        int nums2Index = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[nums1Index] >= nums2[nums2Index]) {
                // 1.当发现num2可以插入时，将nums1的所有值往后移一位
                for (int x = m; x > nums1Index; x--) {
                    nums1[x] = nums1[x - 1];
                }
                m++;
                // 2.将nums2的值插入至nums1的前一位
                nums1[nums1Index] = nums2[nums2Index];
                nums2Index++;
                nums1Index++;
            } else if (m == i) {
                // 将剩余的nums2值赋值给nums1的最后
                while (nums2Index != nums2.length) {
                    nums1[nums1Index++] = nums2[nums2Index];
                    nums2Index++;
                }
            } else {
                nums1Index++;
            }

            if (nums2Index == n) {
                break;
            }

        }
    }
}
