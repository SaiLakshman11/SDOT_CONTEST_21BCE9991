//10
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] prep = new long[n];
        long[] sufp = new long[n];
        prep[0] = 1;
        sufp[n-1] = 1;
        for(int i=1; i<n;i++){
            prep[i] = prep[i-1]*nums[i-1];
            sufp[n-1-i] = sufp[n-i]*nums[n-i];
        }
        long[] pro = new long[n];
        for(int i=0; i<n; i++){
            pro[i] = prep[i]*sufp[i];
        }
        return pro;
	} 
}