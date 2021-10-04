package miu.edu.activitytracking.domain;

import javax.persistence.*;

@Entity
public class ActivityDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long subCategoryId;
    private double quantity;
    private long profileId;

    @OneToOne
    private UnitOfMeasure uom;
}
