package com.dalal.annotations;

@Developper(code = "A200",experience = 7) // parce que j'ai appliquer le target dans le field et le type
//pour savoir le développeur qui a créé cette classe
//par ex, c'est pour savoir s'il a respecté les conventions de nommage en java par exemple
public class Etudiant {
    @Developper(code = "A200",experience = 7) //ElementType.FIELD
    private int age;
}

