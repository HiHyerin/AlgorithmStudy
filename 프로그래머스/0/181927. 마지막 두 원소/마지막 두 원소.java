class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int beforeLastVal = num_list[num_list.length-2];
        int lastVal = num_list[num_list.length-1];
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        if(lastVal > beforeLastVal) {
            answer[num_list.length] = lastVal - beforeLastVal;
        } else {
            answer[num_list.length] = lastVal * 2;
        }
        
        return answer;
    }
}