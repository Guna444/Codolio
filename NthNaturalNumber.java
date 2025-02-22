

// User function Template for Java


// User function Template for Java

class Solution {
    long findNth(long n) {
        // code here
        long ans=0;
        long temp=1;
        while(n>0){
            ans+=temp*(n%9);
            temp=temp*10;
            n=n/9;
        }
        return ans;
    }
}