package com.dharshini.crms.crms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dharshini.crms.crms.domain.login;

@Repository
public interface loginrepo extends JpaRepository<login,String>{
login findByUsernameandPassword(String username,String password);
}
