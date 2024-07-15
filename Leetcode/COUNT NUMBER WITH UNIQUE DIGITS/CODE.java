class Solution {
public:
    int countNumbersWithUniqueDigits(int n) {
        //9 * 9 + 10 for n = 2
        //9 * 9 * 8 + 9 * 9 +  10 for n = 3
        //9 * 9 * 8 * 7 + 9 * 9 * 8 + 9 * 9 +  10 for n = 4
        //9 * 9 * 8 * 7 * 6 + 9 * 9 * 8 * 7 + 9 * 9 * 8 + 9 * 9 +  10 for n = 5
        
        
        if(n == 0)
            return 1;
       if(n == 1)
            return 10;

            int ans = 1 + 9;//1 for the 0, and 9 for the single digit.
            int product = 9;
            for(int i = 2; i <= n; i++){
                product = product * (11 - i);
                ans += product;
            }

            return ans;
        }
        
    
};