//12
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] premax = new int[n+1];
        int[] sufmax = new int[n+1];
        for(int i=0; i<n; i++){
            if(premax[i]<height[i]){
                premax[i+1] = height[i];
            }
            else{
                premax[i+1] = premax[i];
            }
        }
        for(int i=n-2; i>=0; i--){
            if(sufmax[i+1]<height[i+1]){
                sufmax[i] = height[i+1];
            }
            else{
                sufmax[i] = sufmax[i+1];
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            int a = Math.min(premax[i],sufmax[i]);
            int b = a-height[i];
            if(b>0){
                count+=b;
            }
        }
        return count;
    }
}