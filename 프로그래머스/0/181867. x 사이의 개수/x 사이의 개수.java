class Solution {
    public int[] solution(String myString) {
        String[] splitValue = myString.split("x",myString.length());
		int[] answer = new int[splitValue.length];
		for(int i=0; i< splitValue.length; i++) {
			answer[i] = splitValue[i].length();
		}
        return answer;
    }
}