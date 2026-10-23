class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st = new Stack<>();
      for(String op : operations){
        if(op.equals("+")){
            int top = st.pop();
            int ntop = top + st.peek();
            st.push(top);
            st.push(ntop);
        }
        else if(op.equals("D")){
            st.push(2*st.peek());
        }else if(op.equals("C")){
            st.pop();
        }
        else{
            st.push(Integer.parseInt(op));
        }
        }
        int tsum = 0;
        for(int score : st){
            tsum += score;
      }  
        return tsum;
    }
}