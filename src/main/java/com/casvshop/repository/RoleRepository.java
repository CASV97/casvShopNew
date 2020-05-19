package com.casvshop.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casvshop.model.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Serializable> {
	Role findByName(String name);
}
