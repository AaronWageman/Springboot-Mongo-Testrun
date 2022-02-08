package io.jobset.jobapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {
    
    @Autowired
    private FacultyRepository repo;

    @PostMapping("/addFaculty")
    public String saveFaculty(@RequestBody Faculty fac){
        repo.save(fac);
        return "Added faculty with id: " + fac.getFacId();
    }

    @GetMapping("/findAllFaculty")
    public List<Faculty> getFacultys(){
        return repo.findAll();
    }

    @GetMapping("/findAllFaculty/{id}")
    public Optional<Faculty> getFaculty(@PathVariable String id){
        return repo.findById(id);
    }

    @GetMapping("/findAllFaculty/n{name}")
    public List<Faculty> getFacultybyName(@PathVariable String name){
        return repo.findByName(name);
    }

    @PutMapping("/updateFaculty")
    public String updateFaculty(@RequestBody Faculty fac){
        repo.save(fac);
        return "Updated faculty with id: " + fac.getFacId();
    }

    
    
    @DeleteMapping("/delete/{id}")
    public String deleteFaculty(@PathVariable String id){
        repo.deleteById(id);
        return "faculty deleted with id: " + id;

    }


    @GetMapping("/findAllFaculty/curr")
    public List<Faculty> sortFacultyByCurr(){
        Sort sort = Sort.by(Direction.DESC, "currStu");
        List<Faculty> faculty = new ArrayList<>();
        repo.findAll()
        .forEach(faculty::add);
        return repo.findByOrderByCurrStu(faculty, sort);
    }


}
