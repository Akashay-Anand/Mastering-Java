int minimumKeypadClickCount(string input)
{
       char keyboard[9][3] = {
           {'a', 'b', 'c'},
           {'d', 'e', 'f'},
           {'g', 'h', 'i'},
           {'j', 'k', 'l'},
           {'m', 'n', 'o'},
           {'p', 'q', 'r'},
           {'s', 't', 'u'},
           {'v', 'w', 'x'},
           {'y', 'z', ''}};
         int l, cnt1 = 0, cnt2 = 0;
            l = input.length();
            for (int i = 0; i < l; i++)
            {
                int d = input[i] - 97;
                d = d % 3;
                cnt1 += (d + 1);
            }
            for (int i = 0; i < l; i++)
            {
                for (int j = 0; j < 9; j++)
                {
                    for (int k = 0; k < 3; k++)
                    {
                        if (keyboard[j][k] == input[i])
                        {
                            cnt2 += (k + 1);
                        }
                    }
                }
            }
            return cnt2;
            
}