class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }
        int k = 1;
        while(k<=n){
            if(hs.contains(k)){
                k++;
            }
            else{
                return k;
            }
        }
        return k;
    }
}