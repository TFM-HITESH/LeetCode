class Solution {
    public boolean isValidSudoku(char[][] board) {

        // helper function to make sure that all elements 1-9 only appear once uniquely in given array of size 9
        
        // first check all rows using helper
        // then make column builder and populate array for checking
        // then make box builder and populate array for checking
        
        for(int i=0; i<board.length; i++)
        {
            if(!checkNine(board[i]))
            {
                return false;
            }
        }

        char p[] = new char[9];
        int ptr = 0;

        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                p[ptr] = board[j][i];
                ptr++;
            }

            if(!checkNine(p))
            {
                return false;
            }
            ptr = 0;
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                ptr = 0;
                for(int m=0; m<3; m++)
                {
                    for(int n=0; n<3; n++)
                    {
                        p[ptr] = board[i*3 + m][j*3 + n];
                        ptr++;
                    }
                }
                
                if(!checkNine(p))
                {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkNine(char[] arr)
    {
        char check[] = new char[10];
        int ptr = 0;

        for(char c : arr)
        {
            if(c != '.')
            {
                for(int i=0; i<ptr; i++)
                {
                    if(c == check[i])
                    {
                        return false;
                    }
                }
                check[ptr] = c;
                ptr++;
            } 
        }

        return true;

    }
}