class Solution {
    public int solution(int n) {
        int answer = n;

        do {
            answer++;
        } while (!(Integer.bitCount(answer) == Integer.bitCount(n)));

        // System.out.println(Integer.bitCount(n));

        return answer;
    }
}