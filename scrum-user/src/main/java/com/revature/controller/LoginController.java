package com.revature.controller;

import com.revature.model.ScrumUser;
import com.revature.service.ScrumUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private ScrumUserService scrumUserService;

    @GetMapping("/")
    public String login(){
        return "hello world";
    }

    @GetMapping("/users")
    public ResponseEntity<List<ScrumUser>> users(){
        return new ResponseEntity<>(scrumUserService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<ScrumUser> getUser(@PathVariable int id){
        return new ResponseEntity<>(scrumUserService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ModelAndView addUser(@RequestBody ScrumUser su){
        scrumUserService.save(su);
        return new ModelAndView("redirect:/users");
    }

    @PutMapping("/users/{id}")
    public ModelAndView updateUser(@PathVariable int id, @RequestBody ScrumUser newSu){
        ScrumUser su = scrumUserService.findById(id);
        String newUsername = newSu.getUsername();
        String newPassword = newSu.getPassword();
        String newFirstName = newSu.getFirstName();
        String newLastName = newSu.getLastName();

        if(newUsername != null){
            su.setUsername(newUsername);
        }
        if(newPassword != null){
            su.setPassword(newPassword);
        }
        if(newFirstName != null){
            su.setFirstName(newFirstName);
        }
        if(newLastName != null){
            su.setLastName(newLastName);
        }

        if(newSu != null){
            scrumUserService.save(su);
        }
        return new ModelAndView("redirect:/users");
    }

    @DeleteMapping("/users/{id}")
    public ModelAndView deleteUser(@PathVariable int id){
        ScrumUser su = scrumUserService.findById(id);
        scrumUserService.delete(su);
        return new ModelAndView("redirect:/users");
    }
}
