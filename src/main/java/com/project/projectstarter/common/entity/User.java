package com.project.projectstarter.common.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "app_user", uniqueConstraints = {@UniqueConstraint(columnNames = "phone"),
        @UniqueConstraint(columnNames = "email")})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @PrePersist
    public void beforePersist() {
        Date now = new Date();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void beforeUpdate() {
        this.updatedAt = new Date();
    }
}
