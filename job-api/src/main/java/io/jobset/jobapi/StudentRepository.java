package io.jobset.jobapi;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Id>{
    
}
