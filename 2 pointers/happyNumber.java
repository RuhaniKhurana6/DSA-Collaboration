class Solution {
  public boolean isHappy(int n) {
    int slow = n, fast = n;
    do {
      slow = sum(slow); // move slow by one
      fast = sum(sum(fast)); // move fast by two
    } while (slow != fast);

    return slow == 1;
  }

  public int sum(int n) {
    int sum = 0;
    while (n > 0) {
      int rem = n % 10;
      sum += rem * rem;
      n /= 10;
    }
    return sum;
  }
}
