class Solution {
    public String solution(String my_string) {
        String[] vowel = {"a", "e", "i", "o", "u"};
        for(String c : vowel) {
            if(my_string.contains(c)) {
                my_string = my_string.replace(c, "");
            }
        }
        return my_string;
    }
}