package Strivers_Problem;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {-3, 2, 1};
        int k = 6;
        System.out.println(longestSubarray(nums, k));
    }
    static int longestSubarray(int[] nums, int k){
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLen = 0;

        while(right < nums.length){
            sum += nums[right];
            if(sum == k){
                maxLen = Math.max((right-left+1), maxLen);
                right++;
            }else if(sum > k){
                sum -=nums[left];
                left++;
                right++;
            }else {
                right++;
            }
        }
        return maxLen;
    }
}
