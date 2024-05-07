class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
       for(answer=2; answer<=n; answer+=2){
           sum+=answer;
       }
        
        return sum;
    }
}