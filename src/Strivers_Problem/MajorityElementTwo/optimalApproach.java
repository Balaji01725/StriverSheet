package Strivers_Problem.MajorityElementTwo;
import java.util.*;

public class optimalApproach {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,3,2,2,2};
        System.out.println(majority(nums));
    }
    static List<Integer> majority(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(cnt1 == 0 && el2 != nums[i]){
                cnt1 = 1;
                el1 = nums[i];
            }else if(cnt2 == 0 && el1 != nums[i]){
                cnt2 = 1;
                el2 = nums[i];
            }else if(el1 == nums[i]){
                cnt1++;
            }else if(el2 == nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for(int i = 0; i < n; i++){
            if(el1 == nums[i]) cnt1++;
            if(el2 == nums[i]) cnt2++;
        }
        int maj = (n/3) + 1;
        if(cnt1 >= maj) ans.add(el1);
        if(cnt2 >= maj) ans.add(el2);
        return ans;
    }
}
