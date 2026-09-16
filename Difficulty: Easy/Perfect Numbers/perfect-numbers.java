class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
                if(n/i!=i && i!=1)
                {
                    sum+=n/i;
                }
            }
        }
        if(n==sum) return true;
        else return false;
    }
};