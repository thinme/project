package com.example.portfolio.repository;

import com.example.portfolio.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {

    @Override
    ArrayList<LoginEntity> findAll();
}
