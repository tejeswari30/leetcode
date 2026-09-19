class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (!st.isEmpty() && st.peek() == curr) {
                st.pop();
            }
            else {
                st.push(curr);
            }
            
        }
        String res = "";
        while(!st.isEmpty()) {
            res = st.pop() + res;
        }
        return res;
    }
}