class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if(A.equals(B)) {
            return 0;
        }
        for(int i=A.length()-1; i>0; i--) {
            String str = "";
            answer ++;
            str += A.substring(i);
            for(int j=0; j<i; j++) {
                str += A.substring(j, j+1);
            }
            if(str.equals(B)) {
                return answer;
            }
        }
        return -1;
    }
}