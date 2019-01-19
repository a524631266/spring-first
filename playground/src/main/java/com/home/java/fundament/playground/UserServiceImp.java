package com.home.java.fundament.playground;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Override
    public void put() {
        System.out.println("success input the data");
    }
    
}