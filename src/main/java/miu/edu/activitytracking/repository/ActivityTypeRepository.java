package miu.edu.activitytracking.repository;

import miu.edu.activitytracking.domain.ActivityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ActivityTypeRepository extends JpaRepository<ActivityType, Long> {

}
