package com.example.demo.controller;

import com.example.demo.model.Service.PersonService;
import com.example.demo.model.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping("/save")
    public String save(@RequestBody Person person) {
        personService.save(person);

        return "redirect:/findAll";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam Long id) {
        personService.delete(id);

        return "redirect:/findAll";
    }


    @ResponseBody()
    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();
    }


}
