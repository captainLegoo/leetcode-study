package com.dcy;

import java.util.Arrays;

/**
 * @author Kyle
 * @date 2023/10/15
 *
 * 80. 删除有序数组中的重复项 II
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1：
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
 */
public class LeetCode80 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        //int[] nums = {0,0,1,1,1,1,2,3,3};
        //int[] nums = {-1,0,0,0,0,3,3};

        //int length = new LeetCode80().removeDuplicates1(nums);
        int length = new LeetCode80().removeDuplicates2(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("length = " + length);
    }

    public int removeDuplicates2(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    public int removeDuplicates1(int[] nums) {
        int p = 0;
        int previous = -10;
        int count = 0;
        int length = nums.length;

        while (p < length) {
            if (previous == nums[p] && ++count <= 2) {
                previous = nums[p];
                p++;
            } else if (previous == nums[p] && count > 2){
                // 清零count
                // 将后续的元素往前移
                for (int i = p; i < length - 1; i++) {
                    nums[i] = nums[i+1];
                }
                //count = 0;
                //previous = -1;
                length = length - 1;
            } else {
                count = 1;
                previous = nums[p];
                p++;
            }
        }
        return length;
    }
}
