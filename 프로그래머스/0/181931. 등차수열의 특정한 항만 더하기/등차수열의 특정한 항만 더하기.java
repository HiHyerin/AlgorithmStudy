class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] ap = new int[included.length];
        ap[0] = a;
        for(int i=1; i<included.length; i++) {
            a += d;
            ap[i] = a;
        }
        
        for(int i=0; i<included.length; i++) {
            if(included[i]) {
                answer += ap[i];
            }
        }

        
        return answer;
    }
}