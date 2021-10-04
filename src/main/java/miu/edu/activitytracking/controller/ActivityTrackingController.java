package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.ActivityCategory;
import miu.edu.activitytracking.domain.ActivityTracking;
import miu.edu.activitytracking.repository.ActivityCategoryRepository;
import miu.edu.activitytracking.repository.ActivityTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/trackings")
public class ActivityTrackingController {

    @Autowired
    private ActivityTrackingRepository activityTrackingRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<ActivityTracking> findAll(){
        return activityTrackingRepository.findAll();
    }

    @PostMapping
    public ActivityTracking save(@Validated @NotNull @RequestBody ActivityTracking item){
        return activityTrackingRepository.save(item);
    }

    @PutMapping(value = "/{id}")
    public ActivityTracking update(@Validated @NotNull @RequestBody ActivityTracking item, @PathVariable Long id){
        return activityTrackingRepository.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        activityTrackingRepository.deleteById(id);
    }
}
