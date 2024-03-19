class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            int a = nums[i];
            if(hm.containsKey(a)){
                int k = hm.get(a);
                hm.put(a,++k);
            }
            else{
                hm.put(a,1);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry e : hm.entrySet()){
            if((e.getValue()).equals(1)){
                int x = (int)(e.getKey());
                al.add(x);
            }
        }
        
        int p = al.size();
        int[] arr = new int[p];
        for(int i=0; i<p; i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}