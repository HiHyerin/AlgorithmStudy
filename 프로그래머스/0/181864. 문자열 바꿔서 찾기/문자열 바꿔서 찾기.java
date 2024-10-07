class Solution {
    public int solution(String myString, String pat) {
        String changeString = "";
        for(char s:myString.toCharArray()) {
            if(s == 'A') {
                changeString += 'B';
            } else {
                changeString += 'A';
            }
        }
        if(changeString.contains(pat)) {
            return 1;
        }
        return 0;
    }
}