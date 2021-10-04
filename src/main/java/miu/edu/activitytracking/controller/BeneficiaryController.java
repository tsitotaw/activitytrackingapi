package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.Beneficiary;
import miu.edu.activitytracking.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/beneficiaries")
public class BeneficiaryController {

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Beneficiary> findAll(){
        return beneficiaryRepository.findAll();
    }

    @PostMapping
    public Beneficiary save(@Validated @NotNull @RequestBody Beneficiary item){
        return beneficiaryRepository.save(item);
    }

    @PutMapping(value ="/{id}")
    public Beneficiary update(@Validated @NotNull @RequestBody Beneficiary item, @PathVariable Long id){
        return beneficiaryRepository.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        beneficiaryRepository.deleteById(id);
    }
}
