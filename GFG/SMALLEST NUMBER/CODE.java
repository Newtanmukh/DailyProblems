public String smallestNumber(int s, int d) {
         if (s > 9 * d) return "-1";
        
        int[] digits = new int[d];
        
        s--;  // Reserve 1 for the most significant digit if necessary
        for (int i = d - 1; i > 0; i--) {
            if (s > 9) {
                digits[i] = 9;
                s -= 9;
            } else {
                digits[i] = s;
                s = 0;
            }
        }
        
        digits[0] = s + 1;  // Adjust the most significant digit
        
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }
        
        return result.toString();
        
        
        /***
        
          if(s > 9*d) {
            return "-1";
        } 
        string res = "1" + string(d-1, '0');
        s--;
        if(s == 0) {
            return res;
        }
        for(int i = d-1; s > 0; --i) {
            if(s > 9) {
                res[i] += 9;
                s -= 9;
            }
            else {
                res[i] += s;
                s = 0;
            }
        }
        return res;
        
        
        ***/
        
    }