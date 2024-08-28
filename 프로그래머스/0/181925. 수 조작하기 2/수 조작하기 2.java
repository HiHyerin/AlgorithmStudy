class Solution {
    public String solution(int[] numLog) {
        int[] minusValue = new  int[numLog.length -1 ];
        char[] logCharValue = new char[numLog.length - 1];
        
        for(int i=0; i<numLog.length - 1; i++) {
            minusValue[i] = numLog[i+1] - numLog[i];
        }
        
        for(int i=0; i<minusValue.length; i++) {
            switch(minusValue[i]) {
                case 1: logCharValue[i] = 'w'; break;
                case -1: logCharValue[i] = 's'; break;
                case 10: logCharValue[i] = 'd'; break;
                case -10: logCharValue[i] = 'a'; break;
                    
            }
        }
        
        
        return String.valueOf(logCharValue);
    }
}