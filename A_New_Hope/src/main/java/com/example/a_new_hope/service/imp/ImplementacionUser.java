package com.example.a_new_hope.service.imp;

import com.example.a_new_hope.Repository.UserRepository;
import com.example.a_new_hope.Repository.VehiculoRepo;
import com.example.a_new_hope.service.interfaces.InterfazUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionUser implements InterfazUser {
    @Autowired
    private UserRepository userRepo;
}
