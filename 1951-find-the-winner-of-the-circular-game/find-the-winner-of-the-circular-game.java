class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        int size=q.size();
        while(size!=1){
            for(int i=1; i<k; i++){
                int d=q.remove();
                q.add(d);
            }
            q.remove();
            size--;
        }
        int ans=q.peek();
        return ans;
    }
}