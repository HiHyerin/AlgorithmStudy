class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String sutStr = "";
        for(int i=0; i<=t.length()-p.length(); i++) {
            sutStr = t.substring(i, i+p.length());
            if(Long.parseLong(sutStr)<=Long.parseLong(p)) {
                answer ++;
            }
        }
        return answer;
    }
}