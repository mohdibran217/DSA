class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
    private String buildString(String str){

       Stack<Character> st = new Stack<>();
       for(char c : str.toCharArray()){
          if(c!='#'){
            st.push(c);
          }else if(!st.isEmpty()){
            st.pop();
          }
       } 
       return String.valueOf(st);
    }
}