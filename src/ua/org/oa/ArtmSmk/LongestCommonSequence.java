package ua.org.oa.ArtmSmk;
// task 5.

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonSequence {
    public String getLongestCommonSubSequence(String first, String second) {
        int[][] lengths = new int[first.length() + 1][second.length() + 1];

        for (int i = 0; i < first.length(); i++)
            for (int j = 0; j < second.length(); j++)
                if (first.charAt(i) == second.charAt(j))
                    lengths[i + 1][j + 1] = lengths[i][j] + 1;
                else
                    lengths[i + 1][j + 1] =
                            Math.max(lengths[i + 1][j], lengths[i][j + 1]);

        StringBuffer sb = new StringBuffer();
        for (int x = first.length(), y = second.length();
             x != 0 && y != 0; ) {
            if (lengths[x][y] == lengths[x - 1][y])
                x--;
            else if (lengths[x][y] == lengths[x][y - 1])
                y--;
            else {
                assert first.charAt(x - 1) == second.charAt(y - 1);
                sb.append(first.charAt(x - 1));
                x--;
                y--;
            }
        }

        return sb.reverse().toString();
    }
}

