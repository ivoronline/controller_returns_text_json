package com.ivoronline.springboot.controller_returns_text_json.controllers;

import com.ivoronline.springboot.controller_returns_text_json.entities.PersonEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/hello")
  public PersonEntity sayHello() {

    //CREATE INSTANCE
    PersonEntity  personEntity = new PersonEntity();
                  personEntity.id   = 1;
                  personEntity.name = "John";
                  personEntity.age  = 20;

    //RETURN INSTANCE AS JSON STRING
    return personEntity;  //{"id":1,"name":"John","age":20}
  }

}
