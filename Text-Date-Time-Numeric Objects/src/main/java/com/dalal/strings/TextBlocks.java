package com.dalal.strings;

public class TextBlocks {
    public static void main(String[] args) {
        /* pour creer une chaine de charactere multiline et
          et sans cassé la tete avec les sequence d'echapement comme
          \n \t \" \' le text block te donne la possibilité
          d'ecrire comme tu veux c
         */

        String textBlock = """
                je suis dalal 'youness' je serai incha allah 
                "un ingenieur logicielle"      😁
                """;
        // c'est ca la difference avec le string literal basic mais le reste et le memem
        System.out.println(textBlock);

        //Text block = multiline string literal
    }
}
