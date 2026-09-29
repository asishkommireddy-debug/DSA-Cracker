class Solution {
    public int maxVowels(String s, int k) {

        int left = 0;
        int count = 0;
        int maxCount = 0;

        for (int right = 0; right < s.length(); right++) {

            
            char c = s.charAt(right);

         
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {

                count++;
            }


            if (right - left + 1 > k) {

                char remove = s.charAt(left);

                if (remove == 'a' || remove == 'e' ||
                    remove == 'i' || remove == 'o' ||
                    remove == 'u') {

                    count--;
                }

                left++;
            }

            
            if (right - left + 1 == k) {

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}