package com.example.a_new_hope.Repository;

import com.example.a_new_hope.Entity.Encargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncargoRepo extends JpaRepository<Encargo, Long> {

}
