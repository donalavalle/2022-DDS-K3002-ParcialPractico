package com.example.a_new_hope.service.imp;

import com.example.a_new_hope.Repository.ReservaRepo;
import com.example.a_new_hope.service.interfaces.InterfazReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionReserva implements InterfazReserva {

    @Autowired
    private ReservaRepo reservaRepo;
}
