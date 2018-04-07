package com.revature.repository;

import com.revature.model.ScrumUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrumUserRepository extends CrudRepository<ScrumUser, Integer>{
    ScrumUser findById(int id);
    ScrumUser findByUsername(String username);
}
