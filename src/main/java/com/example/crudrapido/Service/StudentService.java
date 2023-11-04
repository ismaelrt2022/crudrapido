package com.example.crudrapido.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudrapido.Entity.Student;
import com.example.crudrapido.Repository.StudentRepository;


@Service
public  class StudentService {
    
    @Autowired
    StudentRepository studentRepository;

    //Usa metodo para consultar todos los estudiantes sin codicion

    public List<Student> getSudents(){
        
        return studentRepository.findAll();

    }

    //Usar Optional por  que no sabes si va llegar
    public Optional<Student> getStudents(Long id){
        return studentRepository.findById(id);
    }
 

    public void saveOrUpdate(Student student){
        
        studentRepository.save(student);

    }

    public void delete(Long id){

       studentRepository.deleteById(id);
    }

}
