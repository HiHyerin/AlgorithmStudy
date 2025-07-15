class Solution {
    public String[] solution(String my_str, int n) {
        int size = 0;
        int length = my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n + 1;
        String[] answer = new String[length];
        for(int i=0; i< length; i++) {
            if(size+n > my_str.length()) {
                answer[i] = my_str.substring(size);
            } else {
                answer[i] = my_str.substring(size, size+n);
            }
            size += n;
        }
        return answer;
    }
}