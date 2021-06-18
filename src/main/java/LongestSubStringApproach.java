import java.util.HashSet;
import java.util.Set;

public class LongestSubStringApproach {
    /*
    swiorwiurjjj
    */
    public static void main(String[] args)
    {
        System.out.println(new LongestSubStringApproach().lengthOfLongestSubstring("Tharani"));
    }

    public int lengthOfLongestSubstring(String s)
    {
        if (s == null || s.equals("")) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> uniqueCharacters = new HashSet<>();
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }


}
