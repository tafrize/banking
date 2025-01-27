package com.project.bankingserver.services.impl;

import com.project.bankingserver.dto.UserDto;
import com.project.bankingserver.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public Integer save(UserDto user) {
        return 0;
    }

    @Override
    public List<UserDto> findAll() {
        return List.of();
    }

    @Override
    public UserDto findById(Integer id) {
        return null;
    }

    @Override
    public void update(UserDto user) {

    }

    @Override
    public void delete(Integer id) {

    }
}
