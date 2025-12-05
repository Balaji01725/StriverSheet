package Strivers_Problem;

public class countOccurenceInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 3};
        int target = 1;
        System.out.println(count(nums, target));
    }
    static int count(int[] nums, int target){
        int[] ans = findFirstAndLastOccurence(nums, target);
        if(ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }
    static int[] findFirstAndLastOccurence(int[] nums, int target){
        int first = findFirstOccerence(nums, target);
        if(first == -1) return new int[] {-1, -1};
        int last = findLastOccurence(nums, target);
        return new int[] {first, last};
    }
    static int findFirstOccerence(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int first = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                first = mid;
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return first;
    }
    static int findLastOccurence(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                last = mid;
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid = 1;
            }else{
                right = mid - 1;
            }
        }
        return last;
    }
}
