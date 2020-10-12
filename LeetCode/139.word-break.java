import java.awt.List;

/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,-1);

        dp[0] = 0;

        for (int i = 0; i < s.length();i++) {
            if(dp[i] != -1) {
                for (int j = i+1; j <= s.length(); j++) {
                    if(wordDict.contains(s.substring(i,j))) {
                        dp[j] = i;
                    }
                }
            }
        }

        return dp[s.length()] != -1;
    }
}
// @lc code=end

