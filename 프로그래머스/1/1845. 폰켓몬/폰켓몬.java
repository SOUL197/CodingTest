import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> mon = new HashSet<>();
        
        for (int num : nums){
            mon.add(num);
        }
        if(nums.length/2 < mon.size()){
            return nums.length/2;
        }
        
        // System.out.println(mon.size());
        
        return mon.size();
    }
}