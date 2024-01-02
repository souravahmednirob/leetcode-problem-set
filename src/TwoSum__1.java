public class TwoSum__1 {

    /**
     * Time complexity O(n^2)
     * Space complexity O(1)
     * <p>
     * This is the best solution
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return null;
    }


    /**
     * Optimized Solution
     *
     * Time complexity O(n)
     * Space complexity O(n)
     */
    /*public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }

            map.put(nums[i], i);
        }

        return null;
    }*/

    /**
     * This Brute Forced
     * Time complexity O(n^2)
     * Space complexity O(1)
     */

    /*
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length; i++ ){
            for(int j = i+1 ; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    }
     */


}
