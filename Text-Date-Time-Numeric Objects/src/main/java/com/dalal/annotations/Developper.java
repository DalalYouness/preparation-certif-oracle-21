package com.dalal.annotations;

public @interface Developper {
    String code(); // je veux savoir le code du développeur
    int experience(); // je veux savoir combien d'expérience a ce développeur
}



/*
*  - une annotation c'est une métadonné , une information de plus
*  on l'ajoutes soit au niveau de la classes , interfaces , methodes , fields ...
*  pour savoir une information de plus
*
*  - les étapes pour creer une annotation :
*     1 - la creation c'est comme la creation d'une interface sauf que le keyword interface
*     doit etre preceder par le @ et je donne un nom commencer par majuscule qui vise le sens
*     de l'information que je veux ajouter
*     2 - c'es les infomations que je veux savoir je les declare dans l'annotation
*    de la meme facon que je declare les methode abstraite d'un interface
*
*
*
*
* */