package com.project.bankingserver.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address extends AbstractEntity {

    private String street;

    private Integer houseNumber;

    private String city;

    private Integer zipCode;

    private String country;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
