class Solution {
    public int solution(int[] num_list) {
        Boolean answer = false ;
        int sumMulti=0, multi=1;
        for(int i=0;i<num_list.length;i++){
            sumMulti+=num_list[i];
            multi*=num_list[i];
        }
        sumMulti*=sumMulti;
        if(multi<sumMulti){
            answer=true;
        }
        
        return answer==true?1:0;
    }
}