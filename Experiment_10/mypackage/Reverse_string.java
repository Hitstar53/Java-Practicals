package mypackage;
public class Reverse_string {
    public static String ReverseIt(String str) {
        int len = str.length();
        int l = len;
        if(len%2!=0) {
            len = len/2 + 1;
        }
        else {
            len = len/2;
        }
        char[] str1 = str.toCharArray();
        char temp;
        for(int i=0;i<len;i++) {
            temp = str1[i];
            str1[i] = str1[l-i-1];
            str1[l-i-1] = temp;
        }
        str = new String(str1);
        return str;
    }
}