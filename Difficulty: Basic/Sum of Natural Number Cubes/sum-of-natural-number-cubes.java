class Solution {
    
    int cube(int n)
    {
        return n*n*n;
    }
    int sumOfSeries(int n) {
        // code here
        int sum=0;
        while(n!=0)
        {
           sum+=cube(n);
           n--;
        }
        return sum;
    }
}