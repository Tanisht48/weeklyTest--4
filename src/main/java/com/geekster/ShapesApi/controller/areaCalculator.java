package com.geekster.ShapesApi.controller;

import com.geekster.ShapesApi.goodCode.iShape;
import org.geekster.mailHandler;
import org.geekster.mailMetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class areaCalculator {

    /* It tells the application Context the container to inject the instance of object Class Circle here currently with the use of @qualifiers because
    * we have multiple beans*/
    @Autowired
    @Qualifier("circle")
    iShape shape1;

    @Autowired
    @Qualifier("triangle")
    iShape shape2;

    @Autowired
    @Qualifier("rectangle")
    iShape shape3;

    @PostMapping("email/{password}")
    public String getPassword(@PathVariable String password)
    {
        mailMetaData.password = password;
        return "password Entered";
    }

    @GetMapping("circle")
    public String printCircleArea()
    {
        String s = "The area of "+shape1.printArea();
        mailMetaData.msgBody = s ;
        mailMetaData.msgSub = "Java Spring assignment with Email Integration 2.o ";
        mailHandler msgsender = new mailHandler();
        msgsender.sendMail();
        return s + " Email Sent";
    }
    @GetMapping("triangle")
    public String printTriangleArea()
    {
        return "The area of "+shape2.printArea();
    }
    @GetMapping("rectangle")
    public String printRectangleArea()
    {
        return "The area of "+shape3.printArea();
    }
}
