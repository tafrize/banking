package com.project.bankingserver.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(
            updatable = false,
            nullable = false,
            name ="createdDate"
    )
    private LocalDateTime creationDate;

    @LastModifiedDate
    @Column(
            name ="lastModifiedDate"
    )
    private LocalDateTime lastUpdated;
}
