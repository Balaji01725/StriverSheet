package Strivers_Problem;

import java.util.*;

public class countSubArrayswithGivenXORK {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(countSubArrays(nums, k));
    }
    static int countSubArrays(int[] nums, int k){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        map.put(0, 1);

        for(int i = 0; i < n; i++){
            prefixSum = prefixSum ^ nums[i];

            int target = prefixSum ^ k;

            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
