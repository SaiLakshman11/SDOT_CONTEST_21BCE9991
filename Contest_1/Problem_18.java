//18
class Sol
{
    int isPossible (String S)
    {
        // your code here
        int n = S.length();
        int a = n/2;
        String s1 = "";
        String s2 = "";
        if(n%2 != 0){
             s1 = S.substring(0,a);
             s2 = S.substring(n-a,n);
        }
        else{
            s1 = S.substring(0,a);
            s2 = S.substring(a,n);
        }
        if(s1.equals(s2))
        return 1;
        else
        return 0;
    }
}