package com.example.java.tools;

import javax.swing.text.AttributeSet;

public class MyCharAt {
    private String sCadena;
    private int index;

    public char MyCharAt(String sCadena, int index) {
        this.sCadena = sCadena;
        this.index = index;
        return 'r';
 //       return sCadena[index];
    }
}
