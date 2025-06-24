package com.odd.store.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "profiles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",unique = true, nullable = false)
    private String name;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "date_of_birth")
    private LocalDate date_of_birth;

    @Column(name = "loyalty_points")
    private int loyalty_points;

    @OneToOne()
    @JoinColumn(name = "id")
    @MapsId
    private User user;

}
