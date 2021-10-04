package miu.edu.activitytracking.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class ActivityType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Name;

    @OneToMany()
    @JoinColumn(name="typeId")
    private Set<ActivityCategory> categories;

    public ActivityType(){}
    public ActivityType(String name) {
        Name = name;
    }

    public Set<ActivityCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<ActivityCategory> categories) {
        this.categories = categories;
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
}
