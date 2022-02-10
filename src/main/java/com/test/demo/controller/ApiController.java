package com.test.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import static com.test.demo.controller.Charts.Dataq;
import static com.test.demo.controller.Details.Data;

@RestController

public class ApiController {

    // Handling post request
    @PostMapping("/api/summ")
    int insert(@RequestBody Details ob)
    {
        // Storing the incoming data in the list
        Data.add(new Details(ob.firstNumber, ob.secondNumber, ob.inputLogin, ob.inputPassword));

        // Iterating using foreach loop
//        for (Details obd : Data) {
//            System.out.println(ob.firstNumber + " " + ob.secondNumber + ob.login + ob.password+ ob.inputLogin + ob.inputPassword);
//        }

//        System.out.println(ob.login.equals(ob.inputLogin));
//        System.out.println(ob.password.equals(ob.inputPassword));
        //реализация аутентификации при помощи json
        if (ob.login.equals(ob.inputLogin) && ob.password.equals(ob.inputPassword)){
            return ob.firstNumber + ob.secondNumber;
        }else {
            return 404;
        }
    }
//    @PostMapping("/api/chart")
//    ArrayList<Charts> insert(@RequestBody Charts dat)
//    {
//        Dataq.add(new Charts(dat.one,dat.two));
//        return Dataq;
////        return ob.firstNumber + ob.secondNumber;
//    }


    }