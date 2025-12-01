package Strivers_Problem;
import java.util.*;

public class unionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4};
        int[] nums2 = {2, 3, 5};

        Set<Integer> set = new HashSet<>();

        for(int i : nums1){
            set.add(i);
        }
        for(int j : nums2){
            set.add(j);
        }
        System.out.println(set);
    }
}
