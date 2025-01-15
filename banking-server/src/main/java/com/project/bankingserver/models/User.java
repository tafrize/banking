package com.project.bankingserver.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data // generer les getters et les setters
@SuperBuilder // création automatique des objets
@NoArgsConstructor
@AllArgsConstructor // pour builder il faut un construicteur avec params
@Entity
@Table(name = "_user")
public class User extends AbstractEntity {

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    //@OneToOne
    //private Address address;

    private boolean active;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "user")
    private List<Contact> contacts;

    @OneToOne
    private Account account;

    @OneToOne
    private Role role;


}
