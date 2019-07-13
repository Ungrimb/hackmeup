package com.example.java.tools;

public class MySplit {

    public static String MySplit(String sCadena, char [] separator) {

        char[] ch = sCadena.toCharArray();
        int j = 0, length = 0, size = 0, coincide = 0;
        String arr = "[";
        String temp = "";

        coincide = 0;
        for (int i = 0; i < ch.length; i++) {
            if (length > j) {
                j++;
            }
            if (separator[coincide] == ch[i]) {
                coincide++;
                temp += Character.toString(ch[i]);
                if (coincide == separator.length) {
                    length++;
                    coincide=0;
                    temp = "";
                    if ((separator.length * length )+ i <= ch.length + separator.length) {
                        arr+=",";}
                }
            } else {
                if (coincide>0) {
                    arr += temp;
                    coincide = 0;
                }
                arr += Character.toString(ch[i]);
            }
        }
        arr +="]";
        return arr;
    }
}
