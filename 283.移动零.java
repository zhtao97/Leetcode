/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        //双指针&交换
        int len = nums.length, left = 0, right = 0;
        for(int i = 0; i < len; i++)
        {
            if(nums[right]!=0)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
    
            }
            right++;

        }



        //双指针
        // if(nums==null)
        // {
        //     return;
        // }
        // int j = 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(nums[i]!=0)
        //     {
        //         nums[j++]=nums[i];
        //     }
        // }
        // for(int i = j; i < nums.length; i++)
        // {
        //     nums[i]=0;
        // }

        //错误思路
        // int len = nums.length;
        // for(int i = 0; i< len ; i++)
        // {
        //     if(nums[i]==0)
        //     {

        //         for(int j = i; j<len ; j++)
        //         {
        //             int temp = nums[j];
        //             nums[j+1]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }

        // }

    }
}
// @lc code=end

