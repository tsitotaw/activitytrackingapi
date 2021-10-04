package miu.edu.activitytracking.controller;

import com.sun.istack.NotNull;
import miu.edu.activitytracking.domain.Address;
import miu.edu.activitytracking.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/addresses")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Address> findAll(){
        return addressRepository.findAll();
    }

    @PostMapping
    public Address save(@Validated @NotNull @RequestBody Address item){
        return addressRepository.save(item);
    }

    @PutMapping(value = "/{id}")
    public Address update(@Validated @NotNull @RequestBody Address item, @PathVariable Long id){
        return addressRepository.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        addressRepository.deleteById(id);
    }
}
