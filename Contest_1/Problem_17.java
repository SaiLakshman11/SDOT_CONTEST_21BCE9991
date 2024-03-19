//17
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int[] pre = new int[n+1];
        for(int i=0; i<n; i++){
            pre[i+1] = pre[i]+arr[i];
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i<n+1;i++){
            if(!hs.add(pre[i]))
            return true;
        }
        return false;
    }
}