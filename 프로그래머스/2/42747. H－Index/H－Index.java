import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        int start = 0;
        while(start < citations.length){
            int h = citations[start];
            int h_count = citations.length - start;
            
            if(h >= h_count){
                answer=h_count;
                break;
            }
            start++;
        }
        
        // System.out.println(citations[4]);
        
        return answer;
    }
}