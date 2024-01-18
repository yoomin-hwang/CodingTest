import java.util.Arrays;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String tree : skill_trees){
            String order = new String();
            for(int i=0; i<tree.length(); i++){
                for(int j=0; j<skill.length(); j++){
                    if(tree.charAt(i) == skill.charAt(j)){
                        order += tree.charAt(i);
                    }
                }
            }
            
            int flag = 0;
            
            for(int i=0; i<order.length(); i++){
                if(skill.charAt(i) != order.charAt(i)) flag = 1;
            }
            if(flag == 0) answer++;
        }
        return answer;
    }
}