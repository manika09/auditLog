package com.example.auditLog.repository;

import com.example.auditLog.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author manika.singh
 * @since 30/03/19
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
