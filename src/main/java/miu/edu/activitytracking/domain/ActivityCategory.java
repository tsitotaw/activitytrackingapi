package miu.edu.activitytracking.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class ActivityCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Name;

    private long typeId;

    @OneToMany()
    @JoinColumn(name="categoryId")
    private Set<ActivitySubCategory> subCategories;

    public ActivityCategory() {}

    public ActivityCategory(String name, long typeId) {
        this.Name = name;
        this.typeId = typeId;
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

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public Set<ActivitySubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<ActivitySubCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
