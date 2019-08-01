package com.kavri.helloWorld.service;

import com.kavri.helloWorld.model.Student;
import com.kavri.helloWorld.repo.Hellorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class HelloServiceImpl {


    @Autowired
    Hellorepository hellorepository;

    public Optional<Student>  fetchData(Integer j){
        return hellorepository.findById(j);
    }

}
