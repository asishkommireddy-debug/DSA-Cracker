class Solution {
    public int rob(int[] nums) {
        int adj1 = 0;
        int adj2 = 0;

        for(int i = 0; i < nums.length; i++){
            int current = Math.max(nums[i] + adj1, adj2);
                adj1 = adj2;
                adj2 = current;

        }
        return adj2;
    }
}