package com.kavuri1.spring.Repository;

//repository class is the parent class of thread operations and we use the primary key of the model class
import com.kavuri1.spring.model.hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepo extends JpaRepository<hello,Integer> {
}
