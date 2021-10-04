package miu.edu.activitytracking.repository;

import miu.edu.activitytracking.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AddressRepository extends JpaRepository<Address, Long> {

}
