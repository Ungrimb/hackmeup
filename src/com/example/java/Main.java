package com.example.java;



import java.util.Arrays;

import static com.example.java.tools.MySplit.MySplit;
import static com.example.java.tools.MySplit2.MySplit2;


public class Main {

    public static void main(String[] args) {

        String sCadena = "Estoecesecunaecprueba";
        String separator = "ec",resultSplit;
        String[] resultSplit2;

        char result []= separator.toCharArray();

        resultSplit2 = MySplit2(sCadena, result);
        System.out.print("[");
        for(int i=0;i<resultSplit2.length-1;i++) {

            if (resultSplit2[i]!=null) {
                System.out.print(resultSplit2[i]);
            }
            if (resultSplit2[i+1]!=null) {
                System.out.print(",");
            }
        }
        System.out.println("]");
//        System.out.println(Arrays.toString(resultSplit2));

        resultSplit = MySplit(sCadena, result);
        System.out.println(resultSplit);

    }
}

