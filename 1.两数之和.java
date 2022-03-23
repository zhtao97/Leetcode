import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //哈希表
            HashMap <Integer,Integer> hashtable=new HashMap<Integer,Integer>();
            for(int i=0; i<nums.length;i++)
            {
                if(hashtable.containsKey(target-nums[i]))
                {
                    return new int[]{hashtable.get(target-nums[i]),i};
                }
                hashtable.put(nums[i],i);
            }
            return new int[0];



 /*暴力枚举 
  int[] nums1=new int[2];
        for(int i = 0; i<nums.length;i++)
        {
            for(int j =i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    nums1[0]=i;
                    nums1[1]=j;
                    return nums1;

                }

            }

        }   
        return new int[0]; 
        */   





    }
}
// @lc code=end

