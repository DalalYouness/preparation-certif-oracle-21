package com.dalal.jdbc;


import com.dalal.jdbc.simplestatement.dao.PersonDao;
import com.dalal.jdbc.simplestatement.dao.PersonDaoImpl;
import com.dalal.jdbc.simplestatement.entites.Person;
import com.dalal.jdbc.simplestatement.presentation.PersonController;
import com.dalal.jdbc.simplestatement.service.PersonServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

/*
* ma3loma mohima rah les interfaces rah homa contract mais ahsan definition
* lihom les interfaces decrivent comment definir certains implemntation
* ou bien dans laquelle on definit certain comportement sans body
* toute classe peut faire ce comportement il l'implemnte c'est pout unifié les chosoe
* pour rester basé sur un contract specifique
*
* */
public class Test {

    public static Person readPersonInfo() throws SQLException {
        Scanner sc = new Scanner(System.in);

        Person person = new Person();
        System.out.println("enter your first name:");
        person.setFirstName(sc.next());

        System.out.println("enter your last name:");
        person.setLastName(sc.next());

        System.out.println("enter your age:");
        person.setAge(sc.nextInt());
        return person;

    }

    public static int readPersonId() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your person id:");
        int id = sc.nextInt();
        return id;
    }
    public static void main(String[] args) throws SQLException {
        PersonServiceImpl personService = new PersonServiceImpl(new PersonDaoImpl());
        PersonController personController = new PersonController(personService);
//        personController.AllPersons();
//
//        System.out.println("************************************");
//        System.out.println("\t\taddPerson");
//        System.out.println("************************************");
//
//        Person person = readPersonInfo();
//        personService.addPerson(person);
//        personController.AllPersons();
//
//        System.out.println("************************************");
//        System.out.println("\t\tdelete person");
//        System.out.println("**********************************");
//
//        Integer id = readPersonId();
//        personService.deletePersonById(id);
//        personController.AllPersons();

        System.out.println("**************************************");
        System.out.println("\t\tfind person by id:");
        System.out.println("***************************************");

        System.out.println(personController.getPersonById(readPersonId()));




    }
}
