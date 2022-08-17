package com.example.a_new_hope.Repository;

import com.example.a_new_hope.Entity.User;
import com.example.a_new_hope.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepo extends JpaRepository<Vehiculo, Long> {

}
