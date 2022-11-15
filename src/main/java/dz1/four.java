package dz1;

public class four {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while (i<j){
            while ((i<j)&&(!Character.isLetterOrDigit(s.charAt(i))))
            {
                i++;
            }
            while ((i<j)&&(!Character.isLetterOrDigit(s.charAt(j))))
            {
                j--;
            }
            char CharLeft = Character.toLowerCase(s.charAt(i));
            char CharRight = Character.toLowerCase(s.charAt(j));
            if (CharLeft!=CharRight) return false;
            i++;
            j--;
        }
        return true;
    }
}
