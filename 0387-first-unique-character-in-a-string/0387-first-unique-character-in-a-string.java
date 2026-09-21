class Solution {
    public int firstUniqChar(String s) {
        int[] count=new int[26];
        char[] chars=s.toCharArray();
        for(char c:chars){
            count[c-'a']++;
        } 

        for(int i=0;i<chars.length;i++){
            if(count[chars[i]-'a']==1){
                return i;
            }

            
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna