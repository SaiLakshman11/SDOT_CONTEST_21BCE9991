//14
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int a = nums[i];
            if(hm.containsKey(a)){
                int c = hm.get(a);
                hm.put(a,++c);
            }
            else{
                hm.put(a,1);
            }
        }
        int x=-1;
        for(Map.Entry e : hm.entrySet()){
            if((e.getValue()).equals(1)){
                x = (int)(e.getKey());
            }
        }
        return x;
    }
}