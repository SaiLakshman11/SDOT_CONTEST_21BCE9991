//15
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)
            return true;
        else{
            for(int i=1; i<Integer.MAX_VALUE;i++){
                if(n == Math.pow(4,i))
                    return true;
                else if(n<Math.pow(4,i)){
                    return false;
                }
            }
        }
        return false;
    }
}