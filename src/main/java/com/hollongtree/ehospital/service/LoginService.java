package com.hollongtree.ehospital.service;

import com.hollongtree.ehospital.Repository.LoginRepository;
import com.hollongtree.ehospital.entity.LoginHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public void saveLogin(LoginHistory login){
        loginRepository.save(login);
    }
}
