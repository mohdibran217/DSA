class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if( c =='('){
                sb.append(c);
                count++;
            }else if(c==')'){
                if(count>0){
                    sb.append(c);
                    count--;
                }
                
            }else{
                sb.append(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = sb.length()-1; i>=0; i--){
            char ch = sb.charAt(i);
            if(ch=='(' && count >0){
                count--;
            }else{
                res.append(ch);
            }
        }
        return res.reverse().toString();
    }
}