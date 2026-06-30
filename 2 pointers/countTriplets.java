class Solution {
  int countTriplets(int sum, int arr[]) {
    // code here
    Arrays.sort(arr);
    int count = 0;
    for (int i = 0; i < arr.length - 2; i++) {
      int target = sum - arr[i];
      int left = i + 1;
      int right = arr.length - 1;
      while (left < right) {
        int loopsum = arr[left] + arr[right];
        if (loopsum < target) {
          count += right - left;
          left++;
        }

        else {
          right--;
        }
      }
    }
    return count;
  }
}