class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String s:dic) {
            int num = 0;
            for(String t:spell) {
                if(s.contains(t)){
                    num ++;
                }
            }
            if(num >= spell.length) {
                return 1;
            }
        }
        return 2;
    }
}