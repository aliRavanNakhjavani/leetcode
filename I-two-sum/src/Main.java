import java.util.Arrays;

public class Main {

    public static int[] twoSumSecondAlgorithm(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return null;
    }
    public static int[] twoSumFirstAlgorithm(int[] nums, int target) {
        int[] ans = new int[2];
        int difference;
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            for (int j = (i + 1); j < nums.length; j++) {
                if (difference == nums[j]){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] twoSumFirstAlgorithm = twoSumFirstAlgorithm(nums, target);
        System.out.println(Arrays.toString(twoSumFirstAlgorithm));
    }
}