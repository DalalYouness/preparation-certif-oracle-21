package com.dalal.OOP;

public class TestDownCasting {
    public static void main(String[] args) {
        Animal a = new Cat("rose",2,4);
        //par default on a fait un up castion parce que la jvm retourne la reference de type cat et on une reference de type animal
        //et puisque le child contient des donné de parent donc on peut faire le case implicitement
        //Animal a1 = (Animal) new Cat("rose",2,4);
        //comme exemple
        //int i = 10;
        //long l = (long)i;
        //hna kay9oliya bali ra le type rah Dog o nta baghi t caster l animal
        //madarhach automatique parceque reference dog khaso ypointer ela un objet contient les attributs dyal dog mais un ref animal yqdr ykon kaypointe ela objet animal
        //fhad l7ala kan7tajo expliciote cast
        //Dog d = (Dog)a; // db rah le meme reference kaypointew ela objet cat c'est pas logique
        //ref de type dog kay pointer ela objet de type cat le comilateur khlaha doz hit howa ma3arfch le type reel
        //howa dar cast l reference o chaf bali dog rah type dyal animal o khalaha doz
        //System.out.println(d); //jvm va lancer une exception hit hiya arfa le type reel

        //solution c'est inctance of pour checker le type reel
//        if(a instanceof Cat) {
//            Cat c = (Cat)a;
//            c.catMethode();
//        } else if (a instanceof Dog) {
//            Dog d = (Dog)a;
//            d.dogMethode();
//
//        }
        //pattern matching
        // le down casting manuel
        //ghayakhod la reference dyal a ghaytchecker f run time wach type howa Cat
        // ghaysayb ref de type Cat khazna fih ref dyal animal o ghaycasteha l Cat o ghada dpz hit l objet reel c'est un chat
        if(a instanceof Cat c) {
            c.catMethode(); //hna 9drna nwaslo l catMethode hit aslan l'objet rah de type cat o ref rah de type cat ghir kana implicitement radinah animal
            //donc fhala raj3nah l type dyalo dkchi elach 9darna nwslo l cat methode
        }

    }
}
