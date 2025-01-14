package com.project.bankingserver.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    private String street;

    private Integer houseNumber;

    private String city;

    private Integer zipCode;

    private String country;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
