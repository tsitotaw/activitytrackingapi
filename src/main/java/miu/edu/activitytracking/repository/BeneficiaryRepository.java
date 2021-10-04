package miu.edu.activitytracking.repository;

import miu.edu.activitytracking.domain.Address;
import miu.edu.activitytracking.domain.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
