package com.example.a_new_hope.Repository;

import com.example.a_new_hope.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {

    public boolean existsByid(int id);
}