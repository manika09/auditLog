package com.example.auditLog.service;

import com.example.auditLog.entity.Person;
import com.example.auditLog.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

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

  public void update(Person person) {
    updatedPerson(this.personRepository.findOne(person.getId()), person);
  }

  private Person updatedPerson(Person existingPerson, Person updatedPerson) {
    if (StringUtils.isNotBlank(updatedPerson.getName())) {
      existingPerson.setName(updatedPerson.getName());
    }

    if (updatedPerson.getAge() != 0) {
      existingPerson.setAge(updatedPerson.getAge());
    }

    if (updatedPerson.getGender() != null) {
      existingPerson.setGender(updatedPerson.getGender());
    }

    return this.personRepository.save(existingPerson);
  }
}
