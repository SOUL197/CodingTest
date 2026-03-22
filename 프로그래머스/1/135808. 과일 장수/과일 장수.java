import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int start = score.length-m*(score.length/m);
        for (int i=start; i<score.length; i+=m){
            answer += score[i]*m;
        }
        
        // System.out.println(score.length/m);

        return answer;
    }
}