package Strivers_Problem;

public class jumbGame {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3};
        System.out.println(jumb(nums));
    }
    static int jumb(int[] nums){
        int jumbs = 0;
        int currEnd = 0;
        int furthest = 0;

        for(int i = 0; i < nums.length-1; i++){
            furthest = Math.max(furthest, i + nums[i]);
            if(i == currEnd){
                jumbs++;
                currEnd = furthest;
            }
        }
        return jumbs;
    }
}
