package Strivers_Problem;

public class maximumSubArrayKadaneys {
    public static void main(String[] args) {
        int[] nums = {-2, -3, -7, -2, -10, -4};
        System.out.println(maximumSubArray(nums));
    }
    static int maximumSubArray(int[] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int num : nums){
            if(sum >= 0){
                sum += num;
            }else{
                sum = num;
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
