// beats 65%
class Solution {
    public int strStr(String haystack, String needle) {
        int sizeH = haystack.length();
        int sizeN = needle.length();
        boolean t = false;
        
        if (haystack == null || needle.equals("")) 
            return 0;
        else if (sizeN > sizeH)
            return -1;
        else {
            for (int i = 0; i < sizeH; i++) {
                if ((sizeH - i) < sizeN)
                    return -1;
                    int m = i;
                for (int j = 0; j < sizeN; j++) {
                    if (needle.charAt(j) == haystack.charAt(m)) {
                        m++;
                        t = true;
                        continue;
                    } else {
                        t = false;
                        break;
                    }   
                }
                if (t)
                    return i;
                else
                    continue;
            }
            return -1;
        }
    }
}

// beats 91.17% by using substring()
class Solution {
    public int strStr(String haystack, String needle) {
        int sizeN = needle.length();
        
        if (needle.isEmpty()) 
            return 0;
        
            for (int i = 0; i < haystack.length() - sizeN + 1; i++) {
                String s = haystack.substring(i, i + sizeN);
                if (s.equals(needle))
                    return i;
            }
            return -1;
    }
}
