class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;        
        
        
        if(eq.equals("=")) {
            if (n == m) {
                return 1;
            } 
        } 
        if(ineq.equals(">")) {
            answer = n > m ? 1 : 0;
        } else {
            answer = n < m ? 1 : 0;
        }
        return answer;
    }
    
    
    
    
        
}