class Solution {
    public boolean backspaceCompare(String s, String t) {

        // holding 2 stacks for both the strings. push when not #, pop when # and not empty
        // finally build back both the strings from stack by emptying. and then check if both stack results are equaL

        Stack<Character> st1 = new Stack<Character>();
        Stack<Character> st2 = new Stack<Character>();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '#')
            {
                if(!st1.empty())
                {
                    st1.pop();
                }
                
            }
            else
            {
                st1.push(s.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++)
        {
            if(t.charAt(i) == '#')
            {
                if(!st2.empty())
                {
                    st2.pop();
                }
            }
            else
            {
                st2.push(t.charAt(i));
            }
        }

        String n = "";
        String m = "";

        while(!st1.empty())
        {
            n += st1.pop();
        }

        while(!st2.empty())
        {
            m += st2.pop();
        }

        System.out.println(n + " " + m);

        return n.equals(m);
    }
}