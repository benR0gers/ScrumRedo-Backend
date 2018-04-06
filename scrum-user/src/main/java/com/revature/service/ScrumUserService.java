package com.revature.service;

import com.revature.model.ScrumUser;
import com.revature.repository.RoleRepository;
import com.revature.repository.ScrumUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScrumUserService {
    @Autowired
    private ScrumUserRepository scrumUserRepository;

    @Autowired
    private RoleRepository roleRepository;

    public List<ScrumUser> findAll(){
        return (List<ScrumUser>)scrumUserRepository.findAll();
    }

    public void save(ScrumUser su){
        if(su.getRole() == null){
            su.setRole(roleRepository.findByRoleName("user"));
        }
        scrumUserRepository.save(su);
    }

    public ScrumUser findById(int id){
        return scrumUserRepository.findById(id);
    }

    public void delete(ScrumUser su){
        scrumUserRepository.delete(su);
    }

}
