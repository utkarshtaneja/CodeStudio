// Check whether the string is plaindrome or not

// Sample Input 1 :
// 2
// N2 i&nJA?a& jnI2n
// A1b22Ba

// Sample Output 1 :
// Yes
// No

import java.util.*;
import java.io.*;

public class Solution {	
    
	public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
			else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
			else {
                if (leftChar != rightChar) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true; 
    }
}

