class Solution {
  public int threeSumClosest(int[] nums, int target) {
    int sum = 0;
    int mindif = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length - 2; i++) {
      int newt = target - nums[i];

      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int localsum = nums[j] + nums[k];
          int diff = Math.abs(newt - localsum);
          if (diff == 0) {
            return localsum + nums[i];
          }
          if (diff < mindif) {
            mindif = Math.min(diff, mindif);
            sum = nums[i] + localsum;
          }
        }
      }
    }
    return sum;
  }
}