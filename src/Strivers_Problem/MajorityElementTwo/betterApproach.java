package Strivers_Problem.MajorityElementTwo;
import java.util.*;

public class betterApproach {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,3,4,4,4};
        System.out.println(majority(nums));
    }
    static List<Integer> majority(int[] nums){
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int maj = (n/3) + 1;

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

            if(map.get(nums[i]) == maj){
                ans.add(nums[i]);
            }
            if(ans.size() == 2) break;
        }
        return ans;
    }
}
