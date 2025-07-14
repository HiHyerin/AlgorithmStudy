import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copyEmergency = Arrays.copyOf(emergency, emergency.length); // [3,5,7]
        int emergencyOrder = emergency.length;
        Arrays.sort(copyEmergency);
        for(int i=0; i<copyEmergency.length; i++) {
            for(int j=0; j<copyEmergency.length; j++) {
                if(copyEmergency[i] == emergency[j]) {
                    answer[j] = emergencyOrder;
                    emergencyOrder--;
                }
            }
        }
        return answer;
    }
}