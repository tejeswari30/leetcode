class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        ArrayDeque<Integer> q = new ArrayDeque<>();

        // put all persons in the queue
        for(int i = 0; i < n; i++) {
            q.offer(i);
        }
        int turns = 0;
        while(tickets[k] > 0) {
            // remove from queue
            int front = q.poll();
            // Serve a ticket
            tickets[front] -= 1;
            // if he/she still needs more tickets
            if(tickets[front] > 0) {
                // put him back in the queue
                q.offer(front); 
            }
            // Increment a counter turns
            turns += 1;
        }
        return turns;
    }
}