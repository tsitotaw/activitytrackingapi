package miu.edu.activitytracking.repository;

import miu.edu.activitytracking.domain.ActivityCategory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ActivityCategoryRepository extends JpaRepository<ActivityCategory, Long> {

}
