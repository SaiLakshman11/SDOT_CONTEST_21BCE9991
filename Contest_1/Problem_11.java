//11
class Solution {
    public int waysToMakeFair(int[] A) {
        int count = 0;
        int n = A.length;
        int left[] = new int[2];
        int right[] = new int[2];
        for (int i = 0; i < n; i++)
            right[i%2] += A[i]; 
        for (int i = 0; i < n; i++) {
            right[i%2] -= A[i];
            if (left[0]+right[1] == left[1]+right[0])
                count++;
            left[i%2] += A[i];
        }
        return count;
    }
    
}