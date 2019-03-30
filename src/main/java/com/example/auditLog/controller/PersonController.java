package com.example.auditLog.controller;

import com.example.auditLog.entity.Person;
import com.example.auditLog.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author manika.singh
 * @since 30/03/19
 */
@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  private PersonService personService;

  @RequestMapping(value = {"/save"}, method = RequestMethod.POST, produces = {
      MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
  public void save() {
    try {
      Person person1 = new Person();
      person1.setName("manika");
      personService.save(person1);
    } catch (Exception e) {
      System.out.print(e);
    }
  }

  @RequestMapping(value = {"/"}, method = RequestMethod.GET, produces = {
      MediaType.APPLICATION_JSON_VALUE})
  public String get() {
    return "working";
  }
}
