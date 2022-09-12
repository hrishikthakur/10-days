class Solution {
    public double power(double x, int n){
        if(n == 0) return 1.0;
        double ans = power(x, n / 2);
        return (n % 2 == 0) ? ans * ans : ans * ans * x;
    }
    
    public double myPow(double x, int n) {
        if(x == 0 || x == 1) return x;
        if(n == 1) return x;
        return n < 0 ? 1.0 / power(x, n) : power(x, n);
    }
}
