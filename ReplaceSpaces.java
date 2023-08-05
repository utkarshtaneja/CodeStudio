// Sample Input 1:
// 2
// Coding Ninjas Is A Coding Platform
// Hello World

// Sample Output 1:
// Coding@40Ninjas@40Is@40A@40Coding@40Platform
// Hello@40World

import java.util.*;
import java.io.*;

public class Solution {
    public static StringBuilder replaceSpaces(StringBuilder str) {
        // Write your code here.
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                ans.append("@40");
            } else {
                ans.append(ch);
            }
        }
        return ans;

    }
}