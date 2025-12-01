package Strivers_Problem;

public class nextPermutation {
    public static void main(String[] args) {
        int[] nums= {2,1,5,4,3,0,0};
        nextPermute(nums);
    }
    static void nextPermute(int[] nums){
        int ind = -1;
        int n = nums.length;

        for(int i = n-2; i >=0; i--){ // Find the mountain point
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        for(int i = n-1; i > ind; i--){
            if(nums[i] > nums[ind]){
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
            }
        }
        reverse(nums, ind+1, nums.length-1);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    static void reverse(int[] nums, int left, int right){
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
