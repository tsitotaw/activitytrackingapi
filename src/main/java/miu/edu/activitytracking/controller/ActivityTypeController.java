package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.ActivityCategory;
import miu.edu.activitytracking.domain.ActivityType;
import miu.edu.activitytracking.repository.ActivityCategoryRepository;
import miu.edu.activitytracking.repository.ActivityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/types")
public class ActivityTypeController {

    @Autowired
    private ActivityTypeRepository activityTypeRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<ActivityType> findAll(){
        return activityTypeRepository.findAll();
    }

    @PostMapping
    public ActivityType save(@Validated @NotNull @RequestBody ActivityType item){
        return activityTypeRepository.save(item);
    }

    @PutMapping(value = "/{id}")
    public ActivityType update(@Validated @NotNull @RequestBody ActivityType item, @PathVariable Long id){
        return activityTypeRepository.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        activityTypeRepository.deleteById(id);
    }
}
