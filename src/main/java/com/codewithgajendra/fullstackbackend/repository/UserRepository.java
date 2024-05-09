package com.codewithgajendra.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithgajendra.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
