package com.example.a_new_hope.service.imp;

import com.example.a_new_hope.Repository.VehiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionVehiculo {
    @Autowired
    private VehiculoRepo vehiculoRepo;
}
