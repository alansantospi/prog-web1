package com.ada.aulaspringweb.repositories;

import com.ada.aulaspringweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByEmailStartingWith(String email);

    User findByEmailContaining(String email);

}
