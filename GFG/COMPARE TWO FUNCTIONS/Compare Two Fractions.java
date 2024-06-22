class Solution {

    String compareFrac(String str) {
         // Code here
         String[] fractions = str.split(", ");

        // Split the first fraction to get numerator and denominator
        String[] fraction1 = fractions[0].split("/");
        Double a = Double.parseDouble(fraction1[0]);
        Double b = Double.parseDouble(fraction1[1]);

        // Split the second fraction to get numerator and denominator
        String[] fraction2 = fractions[1].split("/");
        Double c = Double.parseDouble(fraction2[0]);
        Double d = Double.parseDouble(fraction2[1]);
        
        Double res1=(a/b);
        Double res2=(c/d);
        
        
        if(res1.equals(res2))
            return "equal";
            
        else if(res1>res2)
            return  fraction1[0]+ "/" + fraction1[1];
        
         return fraction2[0] + "/" + fraction2[1];
    }
}