package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.UserTypes;

public interface UserTypesRepository extends JpaRepository<UserTypes, String> {

}
