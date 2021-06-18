import java.util.*;

public class DistinctSubString {

     /*
      swiorwiurjjj
      */
    public static void main(String[] args)
    {
            System.out.println(new DistinctSubString().lengthOfLongestSubstring("Tharani"));
    }

    public int lengthOfLongestSubstring(String s)
    {
        int largestLength=0;
        if(isADistinct(s))
        {
            return s.length();
        }
        for(int i=0;i<=s.length()&& largestLength<s.length()-i;i++)
        {
            int endIndex=s.length();
            while((endIndex-i)>largestLength && endIndex!=0) {
                String subString = s.substring(i, endIndex);
               if(largestLength<subString.length() && isADistinct(subString)) {
                   largestLength=subString.length();
                   break;
               }
                endIndex--;
            }
        }
        return largestLength;
    }

    private boolean isADistinct(String subString) {
        return subString.length() == subString.chars().distinct().count();
    }

}
