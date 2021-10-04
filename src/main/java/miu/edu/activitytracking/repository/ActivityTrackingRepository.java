package miu.edu.activitytracking.repository;

import miu.edu.activitytracking.domain.ActivityTracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityTrackingRepository extends JpaRepository<ActivityTracking, Long> {

}
