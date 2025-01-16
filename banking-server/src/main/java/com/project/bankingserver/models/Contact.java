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
public class Contact {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private String iban;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

}
