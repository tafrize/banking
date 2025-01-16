package com.project.bankingserver.repositories;

import com.project.bankingserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByFirstname(String firstname);


}
