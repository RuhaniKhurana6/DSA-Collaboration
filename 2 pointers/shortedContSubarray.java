class Solution {
  public int findUnsortedSubarray(int[] nums) {
    int n = nums.length;

    int subs = -1;
    int sube = -1;

    // Find first inversion from left
    for (int i = 0; i < n - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        subs = i;
        break;
      }
    }

    // Already sorted
    if (subs == -1) {
      return 0;
    }

    // Find first inversion from right
    for (int i = n - 1; i > 0; i--) {
      if (nums[i - 1] > nums[i]) {
        sube = i;
        break;
      }
    }

    // Find min and max in the unsorted region
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = subs; i <= sube; i++) {
      min = Math.min(min, nums[i]);
      max = Math.max(max, nums[i]);
    }

    // Expand left boundary
    while (subs > 0 && nums[subs - 1] > min) {
      subs--;
    }

    // Expand right boundary
    while (sube < n - 1 && nums[sube + 1] < max) {
      sube++;
    }

    return sube - subs + 1;
  }
}