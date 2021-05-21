package com.example.demo.model.Service;

import com.example.demo.model.entity.Person;
import com.example.demo.model.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Person save(Person person) {
        return personRepo.save(person);
    }

    public void delete(Long id) {
         personRepo.deleteById(id);
    }

    public List<Person> findAll() {
        return personRepo.findAll();
    }


}
