package miu.edu.activitytracking.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class ActivityProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    @OneToMany
    @JoinColumn(name="profileId")
    private List<ActivityDetail> activityDetailList;

    public ActivityProfile() {
    }

    public ActivityProfile(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ActivityDetail> getActivityDetailList() {
        return activityDetailList;
    }

    public void setActivityDetailList(List<ActivityDetail> activityDetailList) {
        this.activityDetailList = activityDetailList;
    }
}
