class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
          int width = right-left;
          int heightt = Math.min(height[left],height[right]);

          int water = width * heightt;
          maxwater = Math.max(maxwater,water);

          if(height[left]<height[right]){
            left++;
          } else{
            right--;
          }
        }
        return maxwater;
    }
}