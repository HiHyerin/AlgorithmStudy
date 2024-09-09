import java.util.*;
class Solution {
    public ArrayList solution(int l, int r) {
        String k = "";
        ArrayList list = new ArrayList();
        for(int i=l; i<=r; i++) {
            k += i;
            if(!k.contains("1")
                    && !k.contains("2")
                    && !k.contains("3")
                    && !k.contains("4")
                    && !k.contains("6")
                    && !k.contains("7")
                    && !k.contains("8")
                    && !k.contains("9")

            ) {
               list.add(Integer.parseInt(k));
            }
            k = "";

        }

        if(list.size() == 0) {
            list.add(-1);
        }
        Collections.sort(list);
        
        return list;
    }
}