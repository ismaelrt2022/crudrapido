package com.example.crudrapido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudrapido.Entity.Student;

//Creacion de interface  para usar como repository

@Repository
public interface StudentRepository  extends JpaRepository<Student,Long>{


    
}
