import java.util.Arrays;
import java.util.Collections;

/*
생각 정리
가장 큰 수는 가장 작은 수와 곱한다
하나는 오름차순 정렬
다른 하나는 내림차순 정렬해서 순차적으로 곱하고 더하면 되지 않을까?
*/

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
//         1차 시도: 테스트 4 시간 초과
//         Integer b[] = Arrays.stream(B).boxed().toArray(Integer[]::new);
        
//         Arrays.sort(A);
//         Arrays.sort(b, Collections.reverseOrder());
        
//         for(int i=0; i< A.length; i++) {
//             answer += A[i]*b[i];
//         }
        
//         2차 시도: primitive int type -> Integer type 변환 없이 구현
//         두 배열 모두 오름차순 정렬 후 인덱스를 달리 해서 접근
        Arrays.sort(A);
        Arrays.sort(B);
        
        int length = A.length;
        
        for(int i=0; i< length; i++) {
            answer += A[i]*B[length - i -1];
        }

        return answer;
    }
}