import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    //Map<Integer,Integer> hashMap=new HashMap<>();

    public int climbStairs(int n) {
        //动态规划
        if(n==1) return 1;
        if(n==2) return 2;
        int p=1;
        int q=2;
        int r=0;
        for(int i =3;i<=n; i++)
        {
            r=p+q;
            p=q;
            q=r;
        }
        return r;






        //数组
        // int[] arr =new int[n];
        // if(n==1)
        // return 1;
        // if(n==2)
        // return 2;
        // else
        // {
        //     arr[0]=1;
        //     arr[1]=2;
        //     for(int i =2;i<=n-1;i++)
        //     {
        //         arr[i]=arr[i-1]+arr[i-2];
        //     }
        //     return arr[n-1];
        // }


        //递归+HashMap
            // if(n==2)
            // return 2;
            // if(n==1)
            // return 1;
            // if(hashMap.get(n)!=null)
            // return hashMap.get(n);
            // else
            // {
            //     int ret = climbStairs(n-1)+climbStairs(n-2);
            //     hashMap.put(n,ret);
            //     return ret;
            // }

        //递归：超出时间限制
        // if(n==1)
        // {
        //     return 1;
        // }
        
        // else if(n==2)
        // {
        //     return 2;
        // }
        // else
        // {
        //     return climbStairs(n-1)+climbStairs(n-2);
        // }
        
        

    }
}
// @lc code=end

