package com.dalal.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // reservation ou bien 7ifd en arabe // discarded takhalos
/*La retention de l'annotation retention ila reste jusqu'a le runtime*/
@Target({ElementType.FIELD,ElementType.TYPE})
@Inherited
public @interface Developper {
    String code() default "A20"; // je veux savoir le code du développeur
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
* ****************************************************************************************
*   la retention
*    * on sait bien que la classe il passe de trois couche
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
 * ***********************************************************************************************
 *
 * target
 *
 * c'est a dire had l'annotation chno ghada tkon katargeter wach class , attribut , methodes ..
 *  par exemple f l'exemple dyalna bghina n3rfo chkoun devloppeur li creea les attribut dyal
 * la classe etudiant
 *
 * @Target(ElementType.targetedPlace) ou un tableau pour creer plusieur
 *
 * *************************************************************************************
 *      Inherited ( pour definir est ce que les annotations est hérité par les classes filles
 *
 *  - si je veux que les classes filles herite une annotations dans la classe
 * mere j'ajoute dans l'annotation creer l'annotation inherited
 *
 * - si non je l'ajoute pas dans ce cas , je dois aussi dans les classes filles
 * ajouter l'nnotation manuellement
 *
 * (test dans la classe Test
 *
 * **************************************************
 *  keyword default
 *  par ex : String code default "A60"
 * hna les informations kan3tihom par default
 * haka l'annotation wakha kanktbha maghat3tinich error
 * ila f 7alat ila kano la kant ta whda fihom ma default
 * ola le machi kamlin fih defaulr
 * kan7tajoha la kna baghi des infos déja 3arfinhom kan7thom au moment dyal creation
 * dyal l'annotation bach ntfadaw la redondonce
*
* ila kano les attributs dyal les annotations fihom whd smito value o howa li machi default o bghiti
* tktbo f imkank tktbo mobachara blama dir value = hit aslan had l parametre kayn par defaulr
* mais ila zdti meaha 7aja akhra khasna ndiro value explicitement
*
*
* */