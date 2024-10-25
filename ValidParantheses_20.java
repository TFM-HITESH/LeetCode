class Solution {

    public boolean isValid(String s) {

        Stack<Character> brackets = new Stack<Character>();
        char c;

        // we use a stack for this
        // in case of opening brackets, just push 
        // in case of closing brackets, we need to deal with them 
        // first check if stack is empty. if it is, its invalid eg : )(())
        // if not, then check the type of closing bracket and see if top of stack is matching type. 
        // if matching, pop it off. else, return false as invalid. keep going
        // if stack is empty at the end, this is correct

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')')
            {   if(!brackets.empty())
                {
                    switch(s.charAt(i))
                    {
                        case ']':
                        {
                            if(brackets.peek() == '[') 
                            {
                                brackets.pop();
                            }
                            else 
                            {
                                return false;
                            }
                            break;
                        }
                        case '}':
                        {
                            if(brackets.peek() == '{') 
                            {
                                brackets.pop();
                            }
                            else 
                            {
                                return false;
                            }
                            break;
                        }

                        case ')':
                        {
                            if(brackets.peek() == '(') 
                            {
                                brackets.pop();
                            }
                            else 
                            {
                                return false;
                            }
                            break;
                        }
                    }
                }
                else
                {   
                    return false;
                }
            }
            else
            {  
                brackets.push(s.charAt(i));
            }
        }

        return brackets.empty();

    }
}