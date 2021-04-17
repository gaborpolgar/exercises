package hackerrank.introducion;

import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Locale local = new Locale("en", "US");
        String us = NumberFormat.getCurrencyInstance(local).format(12324.134);

        new Locale("hi", "IN");
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(12324.134);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(12324.134);
        String france =  NumberFormat.getCurrencyInstance(Locale.FRANCE).format(12324.134);
//        %n soremelés
//%d szám

    }
}
