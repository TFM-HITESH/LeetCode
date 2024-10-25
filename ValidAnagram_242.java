class Solution {
    public boolean isAnagram(String s, String t) {
        
        // sorting both the strings alphabetically and then compare for equality

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String m = "";
        String n = ""; 

        if(s.length() == t.length())
        {
            for(int i=0; i<a.length; i++)
            {
                m += a[i];
                n += b[i];
            }
        }
        else
        {
            return false;
        }

        if(m.equals(n))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}