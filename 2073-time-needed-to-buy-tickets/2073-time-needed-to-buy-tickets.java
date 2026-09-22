class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            q.offer(i);
        }
        int turns = 0;
        while(tickets[k] > 0) {
            
            int front = q.poll();
            tickets[front] -= 1;
            if(tickets[front] > 0) {
                q.offer(front);
            }
            turns += 1;
        }
        return turns;
    }
}