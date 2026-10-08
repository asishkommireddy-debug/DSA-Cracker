class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0,0,candidates,target,current,result);

        return result;
    }

    private void backtrack(
        int start,
        int sum,
        int[] candidates,
        int target,
        List<Integer> current,
        List<List<Integer>> result
    ){
        if( sum == target){
            result.add(new ArrayList<>(current));
            return;
        }

        if(sum > target){
            return;
        }

        for(int i=start; i<candidates.length; i++){
            current.add(candidates[i]);

            backtrack(
                i,
                sum + candidates[i],
                candidates,
                target,
                current,
                result
            );
            current.remove(current.size()-1);
        }
    }
}