package Strivers_Problem;

import java.util.*;

public class longestSubarrayWithSum0 {
    public static void main(String[] args) {
        int[] nums = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(longestSum0(nums));

    }
    static int longestSum0(int[] nums){
        int n = nums.length;
        Map<Integer,Integer> map =  new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum+=nums[i];
            if(sum == 0){
                maxLen = i+1;
            }else{
               if(map.containsKey(sum)){
                   maxLen = Math.max(maxLen, i-map.get(sum));
               }else{
                   map.put(sum, i);
               }
            }
        }
        return maxLen;
    }
}
