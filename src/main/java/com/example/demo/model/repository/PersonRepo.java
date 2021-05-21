package com.example.demo.model.repository;

import com.example.demo.model.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;


@ResponseBody
public interface PersonRepo extends CrudRepository<Person, Long> {

    public Person save(Person person);
    public List<Person> findAll();
//    public void deleteById();

}
