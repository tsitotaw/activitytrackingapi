package miu.edu.activitytracking.repository;

import miu.edu.activitytracking.domain.ActivityProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityProfileRepository extends JpaRepository<ActivityProfile, Long> {

}
