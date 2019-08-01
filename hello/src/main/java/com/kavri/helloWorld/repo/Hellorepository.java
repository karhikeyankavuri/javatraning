package com.kavri.helloWorld.repo;

import com.kavri.helloWorld.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hellorepository extends JpaRepository<Student, Integer> {
}
