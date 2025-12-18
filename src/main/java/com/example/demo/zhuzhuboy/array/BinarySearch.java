package com.example.demo.zhuzhuboy.array;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
 *
 * 你必须编写一个具有 O(log n) 时间复杂度的算法。
 *
 *
 * 示例 1:
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *
 *
 * 提示：
 *
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 */
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] numbs = new int[]{1,2,3,4,5,7,9};
        System.out.println(binarySearch.search(numbs,5));
    }

    public int search(int[] numbs, int target) {
        int i=0,j=numbs.length-1;
        while (i <= j){
            int mid = (i+j)/2;
            if (numbs[mid]<target){
                i = mid+1;
            }else if (numbs[mid]>target){
                j = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}