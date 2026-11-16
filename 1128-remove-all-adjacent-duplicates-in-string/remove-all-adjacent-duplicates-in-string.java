class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            int l = sb.length();
            if(l>0 && sb.charAt(l-1)==ch){
                sb.deleteCharAt(l-1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}