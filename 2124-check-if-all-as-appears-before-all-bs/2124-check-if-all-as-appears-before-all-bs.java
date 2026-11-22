class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'b') {
                found = true;
            }
            else if(found) {
                return false;
            }
        }
        return true;
    }
}