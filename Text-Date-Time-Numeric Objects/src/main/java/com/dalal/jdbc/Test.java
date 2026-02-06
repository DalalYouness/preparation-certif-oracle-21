package com.dalal.jdbc;


import com.dalal.jdbc.simplestatement.dao.PersonDao;
import com.dalal.jdbc.simplestatement.dao.PersonDaoImpl;
import com.dalal.jdbc.simplestatement.entites.Person;
import com.dalal.jdbc.simplestatement.presentation.PersonController;
import com.dalal.jdbc.simplestatement.service.PersonServiceImpl;

import java.sql.SQLException;

/*
* ma3loma mohima rah les interfaces rah homa contract mais ahsan definition
* lihom les interfaces decrivent comment definir certains implemntation
* ou bien dans laquelle on definit certain comportement sans body
* toute classe peut faire ce comportement il l'implemnte c'est pout unifié les chosoe
* pour rester basé sur un contract specifique
*
* */
public class Test {
    public static void main(String[] args) throws SQLException {
        PersonServiceImpl personService = new PersonServiceImpl(new PersonDaoImpl());
        PersonController personController = new PersonController(personService);
        personController.AllPersons();

    }
}
