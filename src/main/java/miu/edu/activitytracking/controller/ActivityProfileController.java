package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.ActivityProfile;
import miu.edu.activitytracking.domain.Address;
import miu.edu.activitytracking.repository.ActivityProfileRepository;
import miu.edu.activitytracking.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/profiles")
public class ActivityProfileController {

    @Autowired
    private ActivityProfileRepository activityProfileRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<ActivityProfile> findAll(){
        return activityProfileRepository.findAll();
    }

    @PostMapping
    public ActivityProfile save(@Validated @NotNull @RequestBody ActivityProfile item){
        return activityProfileRepository.save(item);
    }

    @PutMapping(value = "/{id}")
    public ActivityProfile update(@Validated @NotNull @RequestBody ActivityProfile item, @PathVariable Long id){
        return activityProfileRepository.findById(id)
                .map(profile -> {
                    profile.setName(item.getName());
                    profile.setDescription(item.getDescription());
                    return activityProfileRepository.save(profile);
                })
                .orElseGet(() -> {
                    return activityProfileRepository.save(item);
                });
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        activityProfileRepository.deleteById(id);
    }
}
