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

    public Role getRole() {
        return role;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Account getAccount() {
        return account;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
