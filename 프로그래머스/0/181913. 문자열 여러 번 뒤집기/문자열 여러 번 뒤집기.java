class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
		for(int i = 0; i<queries.length; i++){
			answer = my_string.substring(queries[i][0], queries[i][1] + 1);
			for(int j = answer.length()-1; j>=0; j--){
				sb.append(answer.charAt(j));
			}
            my_string = my_string.substring(0, queries[i][0]) + sb.toString() + my_string.substring(queries[i][1] + 1);
			sb.setLength(0);
		}
        return my_string;
    }
}