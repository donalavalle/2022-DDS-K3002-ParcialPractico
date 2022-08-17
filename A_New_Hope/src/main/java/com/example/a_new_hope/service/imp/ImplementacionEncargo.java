package com.example.a_new_hope.service.imp;

import com.example.a_new_hope.Repository.EncargoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionEncargo {
    @Autowired
    private EncargoRepo encargoRepo;
}
