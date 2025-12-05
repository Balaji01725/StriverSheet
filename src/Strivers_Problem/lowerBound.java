package Strivers_Problem;

public class lowerBound {
    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int target = 9;
        System.out.println(lowerBound(nums, target));
    }
    static int lowerBound(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
