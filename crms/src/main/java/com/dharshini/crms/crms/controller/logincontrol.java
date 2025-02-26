package com.dharshini.crms.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dharshini.crms.crms.domain.login;
import com.dharshini.crms.crms.service.loginservice;

import ch.qos.logback.core.model.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class logincontrol {
@Autowired
private loginservice ser;
@GetMapping("/")
public String getloginpage() {
    return "login";
}
@PostMapping("/login")
public String postloginpage(@RequestParam String username,@RequestParam String password,Model mod) {
   login user2=ser.log(username, password);
   if(user2!=null){
    return "redirect:/welcome";
   }
   else{
    mod.addAttribute("error",)
   }
    
    return entity;
}


}
