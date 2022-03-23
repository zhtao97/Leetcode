import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
       
        int[] arr = new int[m+n];
        for(int ptr =0, aptr=0, bptr=0;ptr<m+n;ptr++)
        {
            if(aptr>=m)
            {
                arr[ptr]= nums2[bptr++];

            }
            else if(bptr>=n)
            {
                arr[ptr]= nums1[aptr++];


            }
            else if(nums1[aptr]<=nums2[bptr])
            {
                arr[ptr]=nums1[aptr++];
            }
            else
            {
                arr[ptr]=nums2[bptr++];
            }


        }

        for(int j =0;j<m+n;j++)
        {
            nums1[j]=arr[j];
        }





        //使用常用类Arrays
        // for(int i =0;i<n;i++)
        // {
        //     nums1[m+i]=nums2[i];
        // }
        // Arrays.sort(nums1);

        //双指针
        // int aptr=m-1;
        // int bptr=n-1;
        // int ptr=m+n-1;
        // while(aptr>=0&&bptr>=0)
        // {
        //     nums1[ptr--]= nums1[aptr]>=nums2[bptr]? nums1[aptr--]:nums2[bptr--];

        // }
        // while(bptr>=0)
        // {
        //     nums1[ptr--]=nums2[bptr--];
        // }






    }
}
// @lc code=end

