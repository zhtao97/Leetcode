import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aptr = headA, bptr = headB;

        int len1 = 0, len2 = 0, diff = 0;
        while(aptr != null)
        {
            len1++;
            aptr = aptr.next;
        }
        while(bptr != null)
        {
            len2++;
            bptr = bptr.next;
        }
        if(len1 < len2)
        {
            aptr = headB; bptr = headA; diff = len2 - len1;
        }
        else
        {
            aptr = headA; bptr = headB; diff = len1 - len2;
        }
        for(int i = 0; i < diff; i++)
        {
            aptr = aptr.next;

        }
        while(aptr != null)
        {
            if(aptr == bptr)
            {
                return aptr;
            }
            aptr = aptr.next;
            bptr = bptr.next;
        }
        return null;


        //双指针
        // if(headA == null || headB == null) return null;
        //    ListNode aptr = headA, bptr = headB;
        //    while(aptr != bptr)
        //    {
        //        aptr = aptr == null ? headB : aptr.next;
        //        bptr = bptr == null ? headA : bptr.next;
        //     //    if(aptr == null)
        //     //    {
        //     //        aptr = headB;
        //     //    }
        //     //    else
        //     //    {
        //     //        aptr = aptr.next;
        //     //    }
        //     //    if(bptr == null)
        //     //    {
        //     //        bptr = headA;
        //     //    }
        //     //    else
        //     //    {
        //     //        bptr = bptr.next;
        //     //    }
        //    }
        //    return aptr;





        //哈希表
        // if(headA == null || headB == null) return null;
        // Set<ListNode> set = new HashSet<>();
        // while(headA != null)
        // {
        //     set.add(headA);
        //     headA = headA.next;
        // }
        // while(headB != null)
        // {
        //     if(set.contains(headB))
        //     {
        //         return headB;
        //     }
        //     else 
        //     {
        //         set.add(headB);
        //         headB = headB.next;
        //     }
            
        // }
        // return null;





        
    }
}
// @lc code=end

