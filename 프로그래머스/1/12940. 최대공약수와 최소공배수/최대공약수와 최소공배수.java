class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;

        for (int i = Math.min(n, m); i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }

        int lcm = n * m / gcd;

        int[] answer = {gcd, lcm};
        
        // System.out.println(n + "," +m);
        // System.out.println(answer[0]+ ", " + answer[1]);
        return answer;
    }
}