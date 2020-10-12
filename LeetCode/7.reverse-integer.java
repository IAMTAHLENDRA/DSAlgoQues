/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.82%)
 * Likes:    3806
 * Dislikes: 5956
 * Total Accepted:    1.2M
 * Total Submissions: 4.8M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Note:
 * Assume we are dealing with an environment that could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 * 
 * Example 1:
 * Input: x = 123
 * Output: 321
 * Example 2:
 * Input: x = -123
 * Output: -321
 * Example 3:
 * Input: x = 120
 * Output: 21
 * Example 4:
 * Input: x = 0
 * Output: 0
 * 
 * 
 * Constraints:
 * 
 * 
 * -2^31 <= x <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long rev= 0;
        boolean neg = false;
        if(x<0) {
            neg = true;
            x *= -1;
        }
        while(x>0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if(rev > Integer.MAX_VALUE) {
            return 0;
        }

        return neg ? (int)(rev *= -1) : (int)(rev);
    }
}
// @lc code=end

