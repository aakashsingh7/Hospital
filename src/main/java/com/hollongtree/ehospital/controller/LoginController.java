package com.hollongtree.ehospital.controller;


import com.hollongtree.ehospital.entity.LoginHistory;
import com.hollongtree.ehospital.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping ("/login")
    public String test3(LoginHistory login){

        return "login";
}

    @PostMapping ("/saveLogin")
    public void saveLogin(@RequestBody LoginHistory login){

        loginService.saveLogin(login);

    }
}
