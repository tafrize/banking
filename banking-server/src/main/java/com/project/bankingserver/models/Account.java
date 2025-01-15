package com.project.bankingserver.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account extends AbstractEntity{

    private String iban;

    private LocalDateTime creationDate;

    private LocalDateTime lastUpdated;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
