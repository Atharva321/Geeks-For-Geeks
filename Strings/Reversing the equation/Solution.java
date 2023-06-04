// Time  : O(n)
// Space : O(n)

Class Solution
{
    String reverseEqn(String S)
    {
        // your code here
        StringBuilder ans = new StringBuilder();
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (Character.isDigit(c)) {
                num.insert(0,c);
            } else {
                ans.append(num);
                ans.append(c);
                num.setLength(0);
            }
        }

        ans.append(num);
        return ans.reverse().toString();
    }
}
