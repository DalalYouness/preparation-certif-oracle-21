package com.dalal.transactions;

import com.dalal.jdbc.simplestatement.connection.ConnectionSingleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TestTransaction {

    private static Connection connection = ConnectionSingleton.getConnection();
    public static void main(String[] args) {
        /*
        *  savepoint hiya point de sauvgarde kan creeh hda whd statement f transaction bach
        *  ila tra mochkil bdabt fhad statement mydi3ch liya ga3 dkchi li mohim qbal manha
        * khaso ykml 3adi o hiya bohadha li ydar
        * liha rollback o matsajlch o aghlabiya hdchi kaytra fl 3amaliya l khtiyarita
        * */

        /*Exemple*/

//        try {
//            connection.setAutoCommit(false); // parce que java mmet le eutocommit par default
//
//            // 1. العملية الأساسية (مثلا: خلص الفاتورة)
//            // إلا وقع غلط هنا، الكود كينقز نيشان لـ catch لتحت
//            //executeSQL1();
//
//            Savepoint sp1 = connection.setSavepoint(); // fhala kadir bariere ola wahd break point
//            //fhal chi point kat7addha
//            // katktb man wraha les operation li bghiti nta mnin ytra fihom probleme maytrach roll back l transaction kamla
//            try {
//                // 2. العملية الثانوية (مثلا: صيفط SMS كيتخلص عليه)
//                //executeSQL2();
//            } catch (SQLException e) {
//                // وقع مشكل غير ف الـ SMS، نرجعو غير لـ sp1
//                connection.rollback(sp1);//ila tra probleme katrj3 ghir l 7ad savepoint o kaykml chi lakhor 3adi
//            }
//
//            // ف لخر كنحفظو داكشي اللي نجح
//            connection.commit();
//
//        } catch (SQLException e) {
//            // هادي كتشد المشاكل الكبيرة (بحال إلا فشلات executeSQL1)
//            //connection.rollback(); // كيمسح كولشي من الزيرو
//        }

    }
}
