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
        //toujours java se base sur les """ dans la fin pour creer les espaces

        System.out.println("*".repeat(20));
        String text = """
                je suis youness dalal
                """;
        System.out.println(text);//y'as pas d'espace avant le je suis
        //mais
        text = """
             je suis dalal youness
                 je serai un ingenieur incha allah
           """;
        System.out.println("*".repeat(20));
        //on observe que je suis mka7za ela akhir """ mabdatch meaha f nfs lbadya dkchi elach kayn espace
        System.out.println(text);

        System.out.println("*".repeat(20));
        //mais!!!!
        text = """
           je suis dalal youness
                 je serai un ingenieur incha allah
           """;
        System.out.println(text);

        //conclusion : chaque ligne devrait etre au meme debut que les derniers """ si non
        // la jvm va la considerer comme un espace c'est pour ca on a pas le droit de faire """ """ directement
        //\s si je veux ajouter un espace
        //\si je veux par exemple eviter le multiline
        //\""" pour ajouter un text contient les """

        System.out.println("*".repeat(20));
        String exemple = """
                je suis\s\
                dalal youness
                """;
        System.out.println(exemple); //pour eviter que les lignes collé je met un\s
    }
}
