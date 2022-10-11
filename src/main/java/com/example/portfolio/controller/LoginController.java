package com.example.portfolio.controller;

import com.example.portfolio.dto.LoginDto;
import com.example.portfolio.entity.LoginEntity;
import com.example.portfolio.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/memberInsert")
    public String memberInset(){
        return "/memberInsert";
    }

    @PostMapping("/memberInsert")
    public String memberInsert(LoginDto dto, Model model){
        LoginEntity saved=loginRepository.save(dto.toEntity());
        return "redirect:/index";
    }
}
