package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.ActivityProfile;
import miu.edu.activitytracking.domain.UnitOfMeasure;
import miu.edu.activitytracking.repository.ActivityProfileRepository;
import miu.edu.activitytracking.repository.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/uom")
public class UnitOfMeasureController {

    @Autowired
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<UnitOfMeasure> findAll(){
        return unitOfMeasureRepository.findAll();
    }

    @PostMapping
    public UnitOfMeasure save(@Validated @NotNull @RequestBody UnitOfMeasure item){
        return unitOfMeasureRepository.save(item);
    }

    @PutMapping(value ="/{id}")
    public UnitOfMeasure update(@Validated @NotNull @RequestBody UnitOfMeasure item, @PathVariable Long id){
        return unitOfMeasureRepository.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        unitOfMeasureRepository.deleteById(id);
    }
}
