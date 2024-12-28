class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sbOdd=new StringBuilder();
        StringBuilder sbEven=new StringBuilder();
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                sbEven.append(num_list[i]);
            }else{
                sbOdd.append(num_list[i]);
            }
        }
        answer=Integer.parseInt(String.valueOf(sbOdd))+Integer.parseInt(String.valueOf(sbEven));
        return answer;
    }
}