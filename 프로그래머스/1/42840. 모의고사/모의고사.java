import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[][] trio = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] scores = new int[3];
        
        for (int i=0; i<answers.length; i++){
            for (int j=0; j<3; j++){
                if(answers[i]==trio[j][i%trio[j].length]){
                    scores[j]++;
                }
            }
        }
        
        int max = Math.max(scores[0],Math.max(scores[1],scores[2]));
        
        List<Integer> list = new ArrayList();
        for (int i=0; i<3; i++){
            if(scores[i]==max){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
        // System.out.println(answers[0]);
        
        return answer;
    }
}