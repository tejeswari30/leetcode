class Solution {
    public String predictPartyVictory(String senate) {
        
        int n = senate.length();
        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        ArrayDeque<Integer> q2 = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            if(senate.charAt(i) == 'R') {
                q1.offer(i);
            }
            else {
                q2.offer(i);
            }

        }
        while(!q1.isEmpty() && !q2.isEmpty()) {
            if(q1.peek() < q2.peek()) {
                q2.poll();
                q1.offer(q1.poll() + n);
            }
            else {
                q1.poll();
                q2.offer(q2.pop() + n);
            }
        }
        if(!q1.isEmpty()) {
            return "Radiant";
        }
        else {
            return "Dire";
        }
        
        

    }
}