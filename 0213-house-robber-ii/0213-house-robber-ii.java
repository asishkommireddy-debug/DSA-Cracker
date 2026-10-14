class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }

        int case1 = robLinear(nums,0,n-2);
        int case2 = robLinear(nums,1,n-1);
        return Math.max(case1,case2);
    }

    private int robLinear(int[] nums, int start, int end){
        int previous1 = 0;
        int previous2 = 0;

        for(int i = start; i <= end; i++){
            int current = Math.max(
                previous1, previous2 + nums[i]
            );

            previous2 = previous1;
            previous1 = current;
        }
        return previous1;
    }
}