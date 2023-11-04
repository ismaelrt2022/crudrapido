package com.example.crudrapido.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.Entity.Student;
import com.example.crudrapido.Service.StudentService;

//Creacion de Controller para el llamado de los metodos del servicio


@RestController 
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //consultar con el metodo GET todos los estudiantes
    @GetMapping 
    public ResponseEntity<List<Student>> getAll(){
        return new ResponseEntity<List<Student>>(studentService.getSudents(), HttpStatus.CREATED);
    }

    //OBtener estudiantes x Id del estudiante metodo de tipo opcional
    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId") long studentId){
        return studentService.getStudents(studentId);
    }



    //Uso de metodo post para guardar y actualizar

    @PostMapping 
    public Student saveUpdate(@RequestBody Student student){

         studentService.saveOrUpdate(student);
         return student;
     
    }

     //Uso de metodo delete para borarar x id del estudiante 
    @DeleteMapping("/{studentId}")
    public void saveUpdate(@PathVariable("studentId") Long stundenId){
       studentService.delete(stundenId);

    }




    
}
