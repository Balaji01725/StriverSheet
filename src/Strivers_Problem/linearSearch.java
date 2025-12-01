package Strivers_Problem;

public class linearSearch {
    public static void main(String[] args) {
        int find = 4;
        int[] nums = {1,2,3,4,5};

        for(int i = 0; i < nums.length; i++){
            if(find ==  nums[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
