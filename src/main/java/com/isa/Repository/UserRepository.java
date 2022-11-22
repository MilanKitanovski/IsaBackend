package com.isa.Repository;

import com.isa.model.User;
import com.isa.model.enums.Gender;
import com.isa.model.enums.UserType;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findUserByEmail(String email);
    public User findById(int id);
    public Optional<User> deleteById(int id);
//    public Page<User> findAll(Pageable pageable);
    public User findUserByName(String name);

    public Optional<User> findOneByEmail(String email);





}
