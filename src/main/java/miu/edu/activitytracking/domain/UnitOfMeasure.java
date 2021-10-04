package miu.edu.activitytracking.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long name;
    private boolean isBoolean;

    public UnitOfMeasure(long id, long name, boolean isBoolean) {
        this.id = id;
        this.name = name;
        this.isBoolean = isBoolean;
    }

    public UnitOfMeasure() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public boolean isBoolean() {
        return isBoolean;
    }

    public void setBoolean(boolean aBoolean) {
        isBoolean = aBoolean;
    }
}
