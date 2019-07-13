package com.example.java.tools;

public class MySplit2 {

    public static String [] MySplit2(String sCadena, char [] separator) {

        char[] ch = sCadena.toCharArray();
        String temp = "",temp2 = "";
        int j = 0, length = 0, size = 0, coincide = 0;
        String[] arr;

        size = ch.length/2;
        arr = new String[size + 1];
        coincide = 0;
        for (int i = 0; i < ch.length; i++) {
            if (length > j) {
                j++;
                temp = "";
            }
            if (separator[coincide] == ch[i]) {
                coincide++;
                temp2 += Character.toString(ch[i]);
                if (coincide == separator.length) {
                    length++;
                    coincide = 0;
                    temp2 = "";
            }
            } else {
                if (coincide>0) {
                    temp += temp2;
                    coincide = 0;
                }
                temp += Character.toString(ch[i]);
            }
            arr[j] = temp;
        }
        return arr;
    }
}