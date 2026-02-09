package com.dalal.OOP;

public class Enumeration {

    public static void main(String[] args) {
        Role role = Role.ADMIN; // kanrj3o la reference de l'objet admin de type role
        System.out.println(role);
        System.out.println(role.ordinal());


        Conditon conditon = Conditon.COLD;
        System.out.println(conditon.getMessage());
    }

}
