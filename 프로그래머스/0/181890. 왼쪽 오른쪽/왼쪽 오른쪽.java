import java.util.*;
class Solution {
    public ArrayList solution(String[] str_list) {
		ArrayList answer = new ArrayList();
        String str = String.join("", str_list);
		for(String s:str_list) {
            if(s.equals("l")) {
                for(int i=0; i<str.indexOf("l"); i++) {
                    answer.add(str_list[i]);
                }
                break;
                
            } else if(s.equals("r")) {
                for(int i=str.indexOf("r")+1; i<str_list.length; i++)                 {
                    answer.add(str_list[i]);
                }
                break;
                
            } 
            
        }
        return answer;
    
    
    }
}