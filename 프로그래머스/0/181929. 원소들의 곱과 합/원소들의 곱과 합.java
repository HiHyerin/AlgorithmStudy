class Solution {
    public int solution(int[] num_list) {
        int powValue = 0;
        int multipleValue = 1;
        
        for(int i=0; i<num_list.length; i++) {
            powValue += num_list[i];
            multipleValue *= num_list[i];
        }
        
        return Math.pow(powValue, 2) < multipleValue ? 0 : 1;
    }
}