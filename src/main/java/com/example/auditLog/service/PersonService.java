package com.example.auditLog.service;

import com.example.auditLog.entity.Person;
import com.example.auditLog.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author manika.singh
 * @since 30/03/19
 */
@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public void save(Person person) {

    this.personRepository.save(person);
  }
}
