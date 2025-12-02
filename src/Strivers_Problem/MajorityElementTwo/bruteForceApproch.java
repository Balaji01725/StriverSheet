package Strivers_Problem.MajorityElementTwo;
import java.util.*;

public class bruteForceApproch {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,3,4,4,4};
        System.out.println(majority(nums));
    }
    static List<Integer> majority(int[] nums){
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if((ans.size() == 0 || ans.get(0) != nums[i]) && (ans.size() < 2 || ans.get(1) != nums[i])){
                int count = 0;
                for(int j = 0; j < n; j++){
                    if(nums[j] == nums[i]){
                        count++;
                    }
                }
                if(count > n/3){
                    ans.add(nums[i]);
                }
            }
            if(ans.size() == 2){
                break;
            }
        }
        return ans;
    }
}
