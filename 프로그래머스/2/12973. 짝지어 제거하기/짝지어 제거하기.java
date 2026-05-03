import java.util.Stack;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println(stack.isEmpty());

        return stack.isEmpty() ? 1 : 0;
    }
}