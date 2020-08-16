class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
        int aIndex = a.length() - 1; //start from right to left
        int bIndex = b.length() - 1;
        int carry = 0;
        
        while(aIndex >= 0 || bIndex >= 0) {
            int aVal=0,bVal=0;
            
            if(aIndex >= 0) {
                aVal = a.charAt(aIndex--) - '0'; //converting it to integer
            }
            
            if(bIndex >= 0) {
                bVal = b.charAt(bIndex--) - '0';
            }
            
            int sum = carry;
            sum = sum + aVal + bVal;
            
            sb.append(sum%2); //if sum = 0, adds 0 | if sum=1, adds 1 | if sum=2, adds 0
            carry = sum/2;   //if sum=0, carry = 0 | sum = 1, carry = 0 | sum = 2, carry = 1
            
        }
        
        //if carry still left, append it
        if(carry > 0) {
             sb.append(carry);
        }
        
        return sb.reverse().toString();
     }
}