

/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {


        //
        // int len = nums.length;
        // for(int num:nums)
        // {
        //     int index = (num-1)%len;
        //     nums[index] += len;
        // }
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i < len; i++)
        // {
        //     if(nums[i]<= len)
        //     {
        //         list.add(i+1);

        //     }

        // }
        // return list;


        //错误思路
        // List<Integer> list = new ArrayList<Integer>();
        // for(int i = 1; i <= nums.length; i++)
        // {
        //     for(int j = 0; j < nums.length; j++)
        //     {
        //         if(i==nums[j])
        //         {
        //             break;
        //         }

        //     }
        //     list.add(i);
        // }
        // return list;


    }
}
// @lc code=end

