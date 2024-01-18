class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for(int i=0; i<s.length(); i++){
            switch(s.toUpperCase().charAt(i)){
                case 'P':
                    p++;
                    break;
                case 'Y':
                    y++;
                    break;
            }
        }
        if(p != y) answer = false;
        

        return answer;
    }
}