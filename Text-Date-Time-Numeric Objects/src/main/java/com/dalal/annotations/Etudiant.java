package com.dalal.annotations;

@Developper(code = "A200",experience = 7)
//pour savoir le développeur qui a créé cette classe
//par ex, c'est pour savoir s'il a respecté les conventions de nommage en java par exemple
public class Etudiant {
    /*
    * on sait bien que la classe il passe de trois couche
    * - la creation .java
    * - la compilation .class
    * - l'exécution ( la classe est chargé dans la mémoire dans un objet de type Class )
    *
    * donc l'annotation lorsqu'on creer une annotation on definit le scope de vie de cette
    * annotation ya3ni 7tal ay etapes tbqa m3ana 3aycha
    *
    * par default ila ma7adtch scope l'annotation 7adha l compilation
    * mais kanbghi n7adad kanst3ml retention hta ila mada bghinaha t3ich
    * on a 3 :
    * @Retention(RetentionPolicy.SOURCE //ghatkon f source code
    *  @Retention(RetentionPolicy.CLASS // atbqa htal compilation
    *  @Retention(RetentionPolicy.RUNTIME // atbqa htal execution donc nqdro nwslo liha b reflexion f runtime
    *
    *
    * */
}

