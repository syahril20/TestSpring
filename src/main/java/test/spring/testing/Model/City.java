package test.spring.testing.Model;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "city", uniqueConstraints = @UniqueConstraint(columnNames = {"city_name"}))
public class City {

    @Id
    @SequenceGenerator(
            name = "citySequence",
            sequenceName = "city_id_sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "citySequence"
    )
    @Column(name = "city_id", nullable = false)
    public long city_id;

    @Column(name = "province_id")
    public long province_id;

    @Column(name = "city_name")
    public String city_name;

    @Column(name = "status")
    public int status = 1;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false)
    public LocalDateTime createdDate;

    @Column(name = "created_by")
    public int createdBy = 1;

    @Column(name = "updated_by")
    public int updatedBy = 1;

    @UpdateTimestamp
    @Column(name = "updated_date")
    public LocalDateTime updatedDate;


}
