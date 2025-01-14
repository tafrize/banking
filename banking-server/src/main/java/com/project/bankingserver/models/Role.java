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
public class Role {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
