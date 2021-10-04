package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.ActivitySubCategory;
import miu.edu.activitytracking.domain.Beneficiary;
import miu.edu.activitytracking.repository.ActivitySubCategoryRepository;
import miu.edu.activitytracking.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/subcategories")
public class ActivitySubCategoryController {

    @Autowired
    private ActivitySubCategoryRepository activitySubCategoryRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<ActivitySubCategory> findAll(){
        return activitySubCategoryRepository.findAll();
    }

    @PostMapping
    public ActivitySubCategory save(@Validated @NotNull @RequestBody ActivitySubCategory item){
        return activitySubCategoryRepository.save(item);
    }

    @PutMapping(value = "/{id}")
    public ActivitySubCategory update(@Validated @NotNull @RequestBody ActivitySubCategory item, @PathVariable Long id){
        return activitySubCategoryRepository.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        activitySubCategoryRepository.deleteById(id);
    }
}
