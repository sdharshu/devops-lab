package com.dharshini.crms.crms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dharshini.crms.crms.domain.login;
import com.dharshini.crms.crms.repository.loginrepo;

@Service
public class loginservice {
@Autowired
private loginrepo rep;
public login log(String username,String password){
    login user1=rep.findByUsernameandPassword(username, password);
    return user1;
}
}
