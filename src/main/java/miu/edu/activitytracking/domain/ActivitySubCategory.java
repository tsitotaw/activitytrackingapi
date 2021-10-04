package miu.edu.activitytracking.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class ActivitySubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Name;

    private long categoryId;

    @OneToMany
    @JoinColumn(name="subCategoryId")
    private List<ActivityDetail> activityDetailList;

    public ActivitySubCategory() {
    }

    public ActivitySubCategory(String name, long categoryId) {
        this.Name = name;
        this.categoryId = categoryId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public List<ActivityDetail> getActivityDetailList() {
        return activityDetailList;
    }

    public void setActivityDetailList(List<ActivityDetail> activityDetailList) {
        this.activityDetailList = activityDetailList;
    }
}
