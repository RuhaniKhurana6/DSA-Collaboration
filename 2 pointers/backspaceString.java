class Solution {
  public boolean backspaceCompare(String s, String t) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '#') {
        if (!stack.isEmpty()) {
          stack.pop();

        }
        continue;
      }
      stack.push(s.charAt(i));
    }
    Stack<Character> stack2 = new Stack<>();
    for (int i = 0; i < t.length(); i++) {
      if (t.charAt(i) == '#') {
        if (!stack2.isEmpty()) {
          stack2.pop();

        }
        continue;
      }
      stack2.push(t.charAt(i));
    }
    return stack.equals(stack2);
  }
}