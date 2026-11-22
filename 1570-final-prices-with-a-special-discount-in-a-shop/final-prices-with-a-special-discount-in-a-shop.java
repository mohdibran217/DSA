class Solution {
    public int[] finalPrices(int[] prices) {
     Stack<Integer> st = new Stack<>();
     int ans[] = prices.clone();
     for(int i =0; i< prices.length; i++){
        
        while(!st.isEmpty() && prices[st.peek()] >= prices[i]){
            int ind = st.pop();
            ans[ind] = prices[ind] - prices[i];
            
        }

        st.push(i);
        
     }   
     return ans;
    }
}