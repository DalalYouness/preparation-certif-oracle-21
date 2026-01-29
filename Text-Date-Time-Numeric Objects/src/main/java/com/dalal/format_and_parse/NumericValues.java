package com.dalal.format_and_parse;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumericValues {
    public static void main(String[] args) throws ParseException {
        //pour formater numeric values ou bien parser on utilise l'object NumberFormat
        //on fait un formatage des nombre selon la localisation
        // on format pour 3raisons : cuurency , how the number displaying in each local , percentage
        //Number => primitive , wrappers, bigDecimal

        //Number Format rah abstract class  o object li kayrj3 howa DecimalFormat o mnin
        //kanbghi nrj3 l currency ola percentage kaykhsni nwjd des instance dyal NumberFormat li ghadin t injecter fihom jvm
        //localisation sf man wraha kadir format o katsift l value numeric li baghi dir lih format
        Integer a = 20;
        Locale locale = Locale.UK;
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        String currency = currencyFormat.format(a);
        String percent = percentFormat.format(a);
        String number = numberFormat.format(a);
        String format = numberFormat1.format(a);
        System.out.println(format);
        System.out.println(currency);
        System.out.println(percent);
        System.out.println(number);



        /************************************************************************************/

        /*par fois nta kaykon endk string bl format deja wajd onta katbghi tjbd mano la valeur numeric hna katkhdm bl parse*/
        System.out.println("*".repeat(20));
        double v = currencyFormat.parse("£20.00").doubleValue();
        System.out.println(v);


        /*
        * ce que je dois retenir de c'est que si je veux formater une valeur c'est a dire pour obtenir
        * currency ou bien le numero selon localisation ou bien le pourcentage on sait bien que
        * si ces symbole sont ajouter a un numero ca devrait un string : donc la premiere des
        * chose je dois creer un objet qui fait ce format et je passe localisation
        * apres l'objet et pres donc je peux faire lo formatage par l'appel de la methode format
        * et je passe la valeur et il va retourner un string
        *
        *
        * - si l'inverse j'ai le string et je veux parser le meme mecanisque de creer un objet
        * qui va faire le parsing je pase la localisation pour qui puisse fairanalyse le string
        * et j'appelle parse qui retourn Number
        *
        *
        *
        * */

    }
}
