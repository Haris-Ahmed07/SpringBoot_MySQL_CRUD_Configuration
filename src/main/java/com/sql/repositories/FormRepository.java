package com.sql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sql.models.Form;

public interface FormRepository extends JpaRepository<Form, Integer>{

}
