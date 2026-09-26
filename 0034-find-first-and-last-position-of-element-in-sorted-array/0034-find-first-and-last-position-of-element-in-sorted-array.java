class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = firstt(nums, target);
        int second = secondd(nums, target);

        return new int[]{first, second};
    }

    public int firstt(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                first = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target) {

                left = mid + 1;
            }
            else {

                right = mid - 1;
            }
        }

        return first;
    }

    public int secondd(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int second = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                second = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target) {

                left = mid + 1;
            }
            else {

                right = mid - 1;
            }
        }

        return second;
    }
}