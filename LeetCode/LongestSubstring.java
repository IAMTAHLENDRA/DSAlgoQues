import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;

        int [] arr = new int[256];

        Arrays.fill(arr,-1);

        int i=0;
        for(int j=0;j<n;j++) {
            i = Math.max(i,arr[s.charAt(j)]+1);
            result = Math.max(result,j-i+1);
            arr[s.charAt(j)] = j;
    }
        return result;
}
}