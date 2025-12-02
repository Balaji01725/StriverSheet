package Strivers_Problem;

public class leadersInAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        findLeaders(nums);
    }
    static void findLeaders(int[] nums){
        int n = nums.length;
        int max = nums[n-1];
        System.out.print(max+" ");

        for(int i = n-2;  i >= 0; i--){
            if(max < nums[i]){
                max = nums[i];
                System.out.print(max+" ");
            }
        }
    }
}
