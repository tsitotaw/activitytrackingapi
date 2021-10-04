package miu.edu.activitytracking.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ActivityTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private ActivityDetail activityDetail;

    private LocalDate trackingDate;
    private int quantity;

    @OneToOne
    private Beneficiary beneficiary;

}
