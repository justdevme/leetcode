// Last updated: 1/10/2026, 3:45:04 PM
1class Solution {
2    // vị trí chẵn (0,2,4,...) phải là chữ số chẵn: {0,2,4,6,8} → 5 cách
3    // vị trí lẻ (1,3,5,...) phải là chữ số nguyên tố: {2,3,5,7} → 4 cách
4    
5    private static final long MOD = 1_000_000_007L;
6    public int countGoodNumbers(long n) {
7        long even = (n + 1) / 2;
8        long odd = n / 2;
9        
10        long countEven = modPow(5, even);
11        long countOdd = modPow(4, odd);
12
13        long res = (countEven * countOdd) % MOD;
14        return (int) res;
15    }
16    public long modPow (long a, long n) {
17        long res = 1;
18        a %= MOD;
19        while (n > 0) {
20            if (n % 2 == 1) res = (res * a) % MOD;
21            a = (a * a) % MOD;
22            n /= 2;
23        }
24    
25        return res;
26    }
27}