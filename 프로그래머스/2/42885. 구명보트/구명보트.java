import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int n = people.length;
        int min = 0;
        int max = people.length - 1;
        Arrays.sort(people);
        while(n > 0){
            if(people[max] + people[min] > limit){
                answer++;
                n--;
            }
            else{
                answer++;
                min++;
                n -= 2;
            }
            max--;
        }
        return answer;
    }
}