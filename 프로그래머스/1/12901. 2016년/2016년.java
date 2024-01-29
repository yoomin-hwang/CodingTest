class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        int d = 0;
        for(int i=0; i<a-1; i++){
            d += months[i];
        }
        d += b-1;
        d %= 7;
        switch(d){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }
        return answer;
    }
}