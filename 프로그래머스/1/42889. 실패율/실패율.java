// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class Solution {
//     public int[] solution(int N, int[] lastStages) {
//         int nPlayers = lastStages.length;
//         int[] nStagePlayers = new int[N + 2];
//         for (int stage : lastStages) {
//             nStagePlayers[stage] += 1;
//         }

//         int remainingPlayers = nPlayers;
//         List<Stage> stages = new ArrayList<>();
//         for (int id = 1 ; id <= N; id++) {
//             double failure = (double) nStagePlayers[id] / remainingPlayers;
//             remainingPlayers -= nStagePlayers[id];

//             Stage s = new Stage(id, failure);
//             stages.add(s);
//         }
//         Collections.sort(stages, Collections.reverseOrder());

//         int[] answer = new int[N];
//         for (int i = 0; i < N; i++) {
//             answer[i] = stages.get(i).id;
//         }
//         return answer;
//     }

//     class Stage implements Comparable<Stage> {
//         public int id;
//         public double failure;

//         public Stage(int id_, double failure_) {
//             id = id_;
//             failure = failure_;
//         }

//         @Override
//         public int compareTo(Stage o) {
//             if (failure < o.failure ) {
//                 return -1;
//             }
//             if (failure > o.failure ) {
//                 return 1;
//             }
//             return 0;
//         }
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int x = 0;                  // 해당 스테이지를 클리어하지 못한 사용자 수
        int player = stages.length; // 초기사용자 = stages.length
        Map<Integer, Double> stagefail = new HashMap<Integer, Double>();

        for(int i=1; i<=N;i++){
            for(int s : stages){
                if(s == i) x++;
            }
            if(player == 0)
                stagefail.put(i, 0.0);
            else {
                stagefail.put(i,(double)x/player); // 현재 스테이지와 실패율 put
                player -= x;
                x = 0;
            }
        }

        List<Map.Entry<Integer, Double>> list_entries = new ArrayList<Map.Entry<Integer, Double>>(stagefail.entrySet());
        // key 오름차순, value로 내림차순정렬
        // 비교함수 Comparator를 사용하여 오름차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Double>>() {
            // compare로 값을 비교
            public int compare(Map.Entry<Integer, Double> obj1, Map.Entry<Integer, Double> obj2) {
                // 내림 차순 정렬
                return obj2.getValue().compareTo(obj1.getValue()); // obj1이 obj2보다 크면 1, 같으면 0, 작으면 -1 반환
            }
        });

        int c = 0;
        for(Map.Entry<Integer, Double> entry : list_entries) {
            answer[c] = entry.getKey(); c++;
        }
        return answer;
    }
}