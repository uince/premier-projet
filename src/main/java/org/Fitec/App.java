package org.Fitec;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ResourceBundle;
import java.util.prefs.Preferences;

/**
 * Hello world!
 *
 */
public class App

{
    public int addition(int x, int y){

        return x + y;
    }

    public static void main( String[] args ) {

        System.out.println("Hello World!");

        String random = RandomStringUtils.randomNumeric(10);

        System.out.println(("chaine = " + random));


        String studentsNumber = ResourceBundle.getBundle("param").getString("students.number");
        System.out.println("Student Number = " + studentsNumber);

        String date = ResourceBundle.getBundle("param").getString("datej");
        System.out.println("Date = " + date);
    }


}
