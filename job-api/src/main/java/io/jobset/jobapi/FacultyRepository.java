package io.jobset.jobapi;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacultyRepository extends MongoRepository<Faculty, String>{
    public List<Faculty> findByName(String name);

    public List<Faculty> findByOrderByCurrStu(List<Faculty> fac, Sort sort);

}