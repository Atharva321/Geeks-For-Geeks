// Time  : O(n)

class GfG
{
    public int remAnagrams(String str1,String str2)
    {
        //add code here.
        int[] count1 = new int[26]; int[] count2 = new int[26];
        for(int i=0;i<str1.length();i++)
        {
            count1[str1.charAt(i)-'a']++;
        }

        for(int i=0;i<str2.length();i++)
        {
            count2[str2.charAt(i)-'a']++;
        }
        int chars=0;
        for(int i=0;i<26;i++)
        {
            if(count1[i]!=count2[i])
            {
                chars+= Math.abs(count1[i]- count2[i]);
            }
        }
        return chars;
    }
}
