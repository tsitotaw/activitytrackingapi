package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.ActivityCategory;
import miu.edu.activitytracking.domain.ActivitySubCategory;
import miu.edu.activitytracking.repository.ActivityCategoryRepository;
import miu.edu.activitytracking.repository.ActivitySubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class ActivityCategoryController {

    @Autowired
    private ActivityCategoryRepository activityCategoryRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<ActivityCategory> findAll(){
        return activityCategoryRepository.findAll();
    }

    @PostMapping
    public ActivityCategory save(@Validated @NotNull @RequestBody ActivityCategory item){
        return activityCategoryRepository.save(item);
    }

    @PutMapping(value = "/{id}")
    public ActivityCategory update(@Validated @NotNull @RequestBody ActivityCategory item, @PathVariable Long id){
        return activityCategoryRepository.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        activityCategoryRepository.deleteById(id);
    }
}
