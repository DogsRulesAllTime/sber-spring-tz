package com.test.demo.controller;
import java.util.ArrayList;
public class Details {

    // Creating an object of ArrayList
    static ArrayList<Details> Data
            = new ArrayList<Details>();
    int firstNumber;
    int secondNumber;
    String login = "admin";
    String password = "1111";
    String inputLogin;
    String inputPassword;
    Details(int firstNumber, int secondNumber,String inputLogin,String inputPassword)
    {
        // This keyword refers to parent instance itself
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.login = login;
        this.password = password;
        this.inputLogin = inputLogin;
        this.inputPassword = inputPassword;
    }
}
