class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0; j < n; j++) {
                int num = matrix[i][j];
                if(set.contains(num)) {
                    return false;
                }
                set.add(num);
            }
        }

        for(int j = 0; j < n; j++) {
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                int num = matrix[i][j];
                if(set.contains(num)) {
                    return false;
                }
                set.add(num);

            }
        }
        return true;

    }
}